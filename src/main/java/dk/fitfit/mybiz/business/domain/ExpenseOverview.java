package dk.fitfit.mybiz.business.domain;

import java.util.List;

public class ExpenseOverview {
	private List<Expense> expenses;
	private double totalVat;
	private double totalPriceWithoutVat;

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}

	public double getTotalVat() {
		return totalVat;
	}

	public void setTotalVat(double totalVat) {
		this.totalVat = totalVat;
	}

	public double getTotalPriceWithoutVat() {
		return totalPriceWithoutVat;
	}

	public void setTotalPriceWithoutVat(double totalPriceWithoutVat) {
		this.totalPriceWithoutVat = totalPriceWithoutVat;
	}
}
