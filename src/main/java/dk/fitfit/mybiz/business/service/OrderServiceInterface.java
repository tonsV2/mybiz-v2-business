package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Order;
import dk.fitfit.mybiz.business.domain.OrderOverview;
import dk.fitfit.mybiz.business.domain.User;

import java.util.List;

public interface OrderServiceInterface extends CrudServiceInterface<Order, Long> {
	OrderOverview calculateOverview(User user, long from, long to);
	List<Order> findAll(User user, long from, long to);
	double totalVat(User user, long from, long to);
	double totalPriceWithoutVat(User user, long from, long to);
}
