package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Client;
import dk.fitfit.mybiz.business.domain.Order;
import dk.fitfit.mybiz.business.domain.Product;
import dk.fitfit.mybiz.business.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends CrudService<Order, Long> implements OrderServiceInterface {
	OrderService(OrderRepository repository) {
//	OrderService(JpaRepository<Order, Long> repository) {
		super(repository);
	}

	@Override
	public Order createOrder(Client client, Product product, int quantity) {
		return null;
	}

	@Override
	public Order addProduct(Order order, Product product, int quantity) {
		return null;
	}
}
