package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Expense;

import java.util.List;


public interface ExpenseServiceInterface {
	Expense findOne(final long id);
	List<Expense> findAll();

	Expense save(Expense expense);
}
