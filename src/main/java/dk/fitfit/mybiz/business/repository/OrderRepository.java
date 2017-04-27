package dk.fitfit.mybiz.business.repository;

import dk.fitfit.mybiz.business.domain.Order;
import dk.fitfit.mybiz.business.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	List<Order> findByUserAndTimestampBetween(User user, long from, long to);
}
