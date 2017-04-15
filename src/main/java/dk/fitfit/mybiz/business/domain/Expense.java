package dk.fitfit.mybiz.business.domain;

public class Expense {
	private Long id;
	private String name;
	private String description;
	private double price;
	private int amount = 1;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return "description";
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(final int amount) {
		this.amount = amount;
	}
}
