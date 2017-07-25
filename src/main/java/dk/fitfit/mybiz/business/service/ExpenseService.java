package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService extends TotalsService<Expense, Long> implements ExpenseServiceInterface {
	ExpenseService(JpaRepository<Expense, Long> repository) {
		super(repository);
	}
}
