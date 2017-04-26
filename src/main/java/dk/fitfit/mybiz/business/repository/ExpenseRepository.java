package dk.fitfit.mybiz.business.repository;

import dk.fitfit.mybiz.business.domain.Expense;
import dk.fitfit.mybiz.business.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	List<Expense> findByUserAndTimestampBetween(User user, long from, long to);
}
