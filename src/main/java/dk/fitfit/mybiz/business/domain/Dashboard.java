package dk.fitfit.mybiz.business.domain;

public class Dashboard {
	private double surplus;
	private double totalVat;

	public Dashboard(double surplus, double totalVat) {
		this.surplus = surplus;
		this.totalVat = totalVat;
	}

	public double getTotalVat() {
		return totalVat;
	}

	public void setTotalVat(double totalVat) {
		this.totalVat = totalVat;
	}

	public double getSurplus() {
		return surplus;
	}

	public void setSurplus(double surplus) {
		this.surplus = surplus;
	}
}
