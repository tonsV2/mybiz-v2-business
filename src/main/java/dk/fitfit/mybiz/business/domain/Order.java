package dk.fitfit.mybiz.business.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long timestamp;
	@OneToMany
	private List<OrderEntity> orderEntities;
	@OneToOne
	private Client client;
	@OneToOne
	private User user;

	//private Conditions conditions;    // Different condi

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
}
