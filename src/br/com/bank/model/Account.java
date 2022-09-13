package br.com.bank.model;

import br.com.bank.exception.InsufficientBalanceException;

public abstract class Account extends Object implements Comparable<Account> {

	protected double balance;
	private int branch;
	private int number;
	private transient Client holder;
	private static int total = 0;

	public Account(int branch, int number) {
		Account.total++;
		this.branch = branch;
		this.number = number;
	}

	public abstract void deposit(double value);

	public void withdraw(double value) {
		if (this.balance < value) {
			throw new InsufficientBalanceException("Balance: " + this.balance + ", Value: " + value);
		}
		this.balance -= value;
	}

	public void transfer(Account destiny, double value) {
		this.withdraw(value);
		destiny.deposit(value);
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		if (number <= 0) {
			System.out.println("Number can't be less than zero!");
			return;
		}
		this.number = number;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		if (branch <= 0) {
			System.out.println("Number can't be less than zero!");
			return;
		}
		this.branch = branch;
	}

	public Client getHolder() {
		return holder;
	}

	public void setTitular(Client holder) {
		this.holder = holder;
	}

	public static int getTotal() {
		return Account.total;
	}

	@Override
	public boolean equals(Object ref) {
		Account outra = (Account) ref;

		if (this.branch != outra.branch) {
			return false;
		}

		if (this.branch != outra.branch) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Account other) {
		return Double.compare(this.balance, other.balance);
	}

	@Override
	public String toString() {
		return "Number: " + this.getNumber() + ", Branch: " + this.getBranch() + ", Saldo: " + this.getBalance();

	}

}