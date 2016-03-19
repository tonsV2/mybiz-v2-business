package dk.fitfit.mybiz.business.service;


import dk.fitfit.mybiz.business.domain.Expense;

public interface ExpenseServiceInterface {
	Expense findOne(final long id);
	Iterable<Expense> findAll();
}
