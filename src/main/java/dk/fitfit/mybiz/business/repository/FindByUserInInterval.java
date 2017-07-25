package dk.fitfit.mybiz.business.repository;

import dk.fitfit.mybiz.business.domain.User;

import java.util.List;

// TODO: This is not a repository and shouldn't be in this package... Or is it?
public interface FindByUserInInterval<T> {
	List<T> findByUserAndTimestampBetween(User user, long from, long to);
}
