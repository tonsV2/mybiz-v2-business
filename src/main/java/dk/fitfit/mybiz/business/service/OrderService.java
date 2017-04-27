package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.*;
import dk.fitfit.mybiz.business.repository.OrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService extends CrudService<Order, Long> implements OrderServiceInterface {
	OrderService(JpaRepository<Order, Long> repository) {
		super(repository);
	}

	@Override
	public OrderOverview calculateOverview(User user, long from, long to) {
		List<Order> orders = findAll(user, from, to);
		double totalVat = totalVat(user, from, to);
		double totalPriceWithoutVat = totalPriceWithoutVat(user, from, to);

		OrderOverview overview = new OrderOverview();
		overview.setOrders(orders);
		overview.setTotalVat(totalVat);
		overview.setTotalPriceWithoutVat(totalPriceWithoutVat);

		return overview;
	}

	@Override
	public List<Order> findAll(User user, long from, long to) {
		return ((OrderRepository) repository).findByUserAndTimestampBetween(user, from, to);
	}

	@Override
	public double totalVat(User user, long from, long to) {
		List<Order> orders = findAll(user, from, to);
		return orders
				.stream()
				.mapToDouble(Order::getVat)
				.sum();
	}

	@Override
	public double totalPriceWithoutVat(User user, long from, long to) {
		List<Order> orders = findAll(user, from, to);
		return orders
				.stream()
				.mapToDouble(Order::getPriceWithoutVat)
				.sum();
	}
}
