package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Expense;


public interface ExpenseServiceInterface extends CrudServiceInterface<Expense, Long> {
	Expense save(String name, String description, double price, int amount);
}
