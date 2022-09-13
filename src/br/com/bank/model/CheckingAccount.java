package br.com.bank.model;

public class CheckingAccount extends Account implements Taxable {

	public CheckingAccount(int branch, int number) {
		super(branch, number);
	}

	@Override
	public void withdraw(double value) {
		double valueToWithdraw = value + 0.2;
		super.withdraw(valueToWithdraw);
	}

	@Override
	public void deposit(double valor) {
		super.balance += valor;
	}

	@Override
	public double getValueTax() {
		return super.balance * 0.01;
	}
	
	@Override
	public String toString() {
		return "Cheking Account, " + super.toString();

	}
}
