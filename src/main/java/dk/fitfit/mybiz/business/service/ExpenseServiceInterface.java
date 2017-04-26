package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Expense;
import dk.fitfit.mybiz.business.domain.ExpenseOverview;
import dk.fitfit.mybiz.business.domain.User;

import java.util.List;

public interface ExpenseServiceInterface extends CrudServiceInterface<Expense, Long> {
	Expense save(User user, String name, String description, double price);
	ExpenseOverview calculateOverview(User user, long from, long to);
	List<Expense> findAll(User user, long from, long to);
	double totalVat(User user, long from, long to);
	double totalPriceWithoutVat(User user, long from, long to);
}
