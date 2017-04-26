package dk.fitfit.mybiz.business.domain;

import javax.persistence.*;

@Entity
public class OrderEntity {
// TODO: This shouldn't be here... The key should be a composite key of order.id and product.id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne
	private Order order;
	@OneToOne
	private Product product;
	private int quantity;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
