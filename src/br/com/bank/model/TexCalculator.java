package br.com.bank.model;

public class TexCalculator {

	private double totalTax;

	public void register(Taxable t) {
		double value = t.getValueTax();
		this.totalTax += value;
	}

	public double getTotalImposto() {
		return totalTax;
	}
}
