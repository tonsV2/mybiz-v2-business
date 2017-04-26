package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Expense;
import dk.fitfit.mybiz.business.domain.ExpenseOverview;
import dk.fitfit.mybiz.business.domain.User;
import dk.fitfit.mybiz.business.repository.ExpenseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService extends CrudService<Expense, Long> implements ExpenseServiceInterface {
	ExpenseService(JpaRepository<Expense, Long> repository) {
		super(repository);
	}

	@Override
	public Expense save(User user, String name, String description, double price) {
		Expense expense = new Expense();
		expense.setUser(user);
		expense.setName(name);
		expense.setDescription(description);
		expense.setPrice(price);
		return this.save(expense);
	}

	@Override
	public ExpenseOverview calculateOverview(User user, long from, long to) {
		List<Expense> expenses = findAll(user, from, to);
		double totalVat = totalVat(user, from, to);
		double totalPriceWithoutVat = totalPriceWithoutVat(user, from, to);

		ExpenseOverview overview = new ExpenseOverview();
		overview.setExpenses(expenses);
		overview.setTotalVat(totalVat);
		overview.setTotalPriceWithoutVat(totalPriceWithoutVat);

		return overview;
	}

	@Override
	public List<Expense> findAll(User user, long from, long to) {
		return ((ExpenseRepository) repository).findByUserAndTimestampBetween(user, from, to);
	}

	@Override
	public double totalVat(User user, long from, long to) {
		List<Expense> expenses = findAll(user, from, to);
		return expenses
				.stream()
				.mapToDouble(Expense::getVat)
				.sum();
	}

	@Override
	public double totalPriceWithoutVat(User user, long from, long to) {
		List<Expense> expenses = findAll(user, from, to);
		return expenses
				.stream()
				.mapToDouble(Expense::getPriceWithoutVat)
				.sum();
	}
}
