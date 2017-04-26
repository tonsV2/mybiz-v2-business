package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Expense;
import dk.fitfit.mybiz.business.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService implements ExpenseServiceInterface {
	private ExpenseRepository expenseRepository;

	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}

	@Override
	public Expense findOne(Long id) {
/*
		Expense expense = new Expense();
		expense.setId(id);
		expense.setName("Name");
		expense.setDescription("Description");
		expense.setPrice(12D);
		expense.setQuantity(2);
		return expense;
*/
		return expenseRepository.findOne(id);
	}

	@Override
	public List<Expense> findAll() {
//		return Lists.newArrayList(findOne(1), findOne(2));
		return expenseRepository.findAll();
	}

	@Override
	public Expense save(final Expense expense) {
		return expenseRepository.save(expense);
	}

	@Override
	public void delete(Long id) {
		expenseRepository.delete(id);
	}

	@Override
	public Expense save(String name, String description, double price, int amount) {
		Expense expense = new Expense();
		expense.setName(name);
		expense.setDescription(description);
		expense.setPrice(price);
		expense.setAmount(amount);
		return expenseRepository.save(expense);
	}

}
