package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.User;

public interface UserServiceInterface extends CrudServiceInterface<User, Long> {
	User save(String username, String password, String email);
}
