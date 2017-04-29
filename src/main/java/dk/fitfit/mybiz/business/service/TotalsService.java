package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Totals;
import dk.fitfit.mybiz.business.domain.User;
import dk.fitfit.mybiz.business.domain.Priceable;
import dk.fitfit.mybiz.business.repository.FindByUserInInterval;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

// TODO: This is such a bad name!!!
public abstract class TotalsService<T extends Priceable, D extends Serializable> extends CrudService<T, D> {
	TotalsService(JpaRepository<T, D> repository) {
		super(repository);
	}

	public Totals<T> calculateTotals(User user, long from, long to) {
		List<T> entities = findAll(user, from, to);
		return new Totals<>(entities);
	}

	private List<T> findAll(User user, long from, long to) {
		return ((FindByUserInInterval<T>) repository).findByUserAndTimestampBetween(user, from, to);
	}

}
