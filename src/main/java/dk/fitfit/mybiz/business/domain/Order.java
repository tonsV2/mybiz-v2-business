package dk.fitfit.mybiz.business.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

// https://javasplash.blogspot.dk/2014/10/expected-identifier-sql-statement.html
@Entity(name = "orders") // Select * from order order by... NO!
public class Order implements Priceable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long timestamp;
	@OneToMany(
			mappedBy = "order",
			cascade = ALL,
			orphanRemoval = true,
			fetch = EAGER
	)
	private final List<OrderEntity> orderEntities = new ArrayList<>();
	@ManyToOne
	private Client client;
	@JsonIgnore
	@ManyToOne
	private User user;

	//private Conditions conditions;    // Different conditions for different orders

	@Override
	public double getVat() {
		return getPrice() * 0.2;
	}

	@Override
	public double getPriceExVat() {
		return getPrice() - getVat();
	}

	@Override
	public double getPrice() {
		return orderEntities
				.stream()
				.mapToDouble(OrderEntity::getPrice)
				.sum();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public List<OrderEntity> getOrderEntities() {
		return orderEntities;
	}

	public void setOrderEntities(List<OrderEntity> orderEntities) {
		this.orderEntities.retainAll(orderEntities);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void addEntity(Product product, int quantity) {
		OrderEntity orderEntity = new OrderEntity(this, product, quantity);
		orderEntities.add(orderEntity);
	}
}
