package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Expense;
import dk.fitfit.mybiz.business.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService extends CrudService<Expense, Long> implements ExpenseServiceInterface {
	ExpenseService(JpaRepository<Expense, Long> repository) {
		super(repository);
	}

	@Override
	public Expense save(User user, String name, String description, double price, int amount) {
		Expense expense = new Expense();
		expense.setUser(user);
		expense.setName(name);
		expense.setDescription(description);
		expense.setPrice(price);
		expense.setAmount(amount);
		return this.save(expense);
	}
}
