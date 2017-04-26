package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CrudService<User, Long> implements UserServiceInterface {
	UserService(JpaRepository<User, Long> repository) {
		super(repository);
	}
}
