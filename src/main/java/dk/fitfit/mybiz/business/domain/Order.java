package dk.fitfit.mybiz.business.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.*;

@Entity(name = "orders") // Select * from order order by... NO!
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long timestamp;
	@OneToMany(mappedBy = "product", cascade = ALL, orphanRemoval = true, fetch = EAGER)
	private List<OrderEntity> orderEntities = new ArrayList<>();
	@OneToOne
	private Client client;
	@OneToOne
	private User user;

	//private Conditions conditions;    // Different conditions for different orders

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
		this.orderEntities = orderEntities;
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

	public void addProduct(Product product, int quantity) {
		OrderEntity orderEntity = new OrderEntity(this, product, quantity);
		orderEntities.add(orderEntity);
	}
}
