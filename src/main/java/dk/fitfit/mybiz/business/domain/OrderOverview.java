package dk.fitfit.mybiz.business.domain;

import java.util.List;

public class OrderOverview {
	private List<Order> orders;
	private double totalVat;
	private double totalPriceWithoutVat;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
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
