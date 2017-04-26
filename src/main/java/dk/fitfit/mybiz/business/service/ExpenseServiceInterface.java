package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Expense;
import dk.fitfit.mybiz.business.domain.User;

public interface ExpenseServiceInterface extends CrudServiceInterface<Expense, Long> {
	Expense save(User user, String name, String description, double price, int amount);
}
