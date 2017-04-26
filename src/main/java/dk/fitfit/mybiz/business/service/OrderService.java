package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends CrudService<Order, Long> implements OrderServiceInterface {
	OrderService(JpaRepository<Order, Long> repository) {
		super(repository);
	}
}
