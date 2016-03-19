package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Expense;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService implements ExpenseServiceInterface {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public Expense findOne(final long id) {
		Expense expense = new Expense();
		expense.setId(id);
		expense.setName("Name");
		expense.setDescription("Description");
		expense.setPrice(12D);
		expense.setAmount(2);
		return expense;
	}

	public Iterable<Expense> findAll() {
		return null;
	}

}
