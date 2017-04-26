package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Client;
import dk.fitfit.mybiz.business.domain.Order;
import dk.fitfit.mybiz.business.domain.Product;

public interface OrderServiceInterface extends CrudServiceInterface<Order, Long> {
	Order createOrder(Client client, Product product, int quantity);
	Order addProduct(Order order, Product product, int quantity);
}
