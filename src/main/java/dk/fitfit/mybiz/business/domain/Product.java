package dk.fitfit.mybiz.business.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private double price;
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore // TODO: Prevent showing of which orders contains this product
	private List<OrderEntity> orderEntities;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<OrderEntity> getOrderEntities() {
		return orderEntities;
	}

	public void setOrderEntities(List<OrderEntity> orderEntities) {
		this.orderEntities = orderEntities;
	}
}
