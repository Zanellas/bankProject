package br.com.bank.model;

public class SavingAccount extends Account {

	public SavingAccount(int branch, int number) {
		super(branch, number);
	}

	@Override
	public void deposit(double value) {
		super.balance += value;
	}
	
	@Override
	public String toString() {
		return "Saving Account, " + super.toString();

	}
}
