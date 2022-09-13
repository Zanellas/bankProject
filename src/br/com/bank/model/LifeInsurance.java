package br.com.bank.model;

public class LifeInsurance implements Taxable {

	@Override
	public double getValueTax() {
		return 42;
	}

}
