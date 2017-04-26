package dk.fitfit.mybiz.business.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

import static javax.persistence.FetchType.EAGER;

@Entity
public class OrderEntity implements Serializable {
	@Id
	@ManyToOne
	private Order order;
	@Id
	@ManyToOne(fetch = EAGER)
	private Product product;
	private int quantity;

	public OrderEntity() {
	}

	OrderEntity(Order order, Product product, int quantity) {
		this.order = order;
		this.product = product;
		this.quantity = quantity;
	}

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
