package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Role;
import dk.fitfit.mybiz.business.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends CrudService<Role, Long> implements RoleServiceInterface {
	RoleService(RoleRepository repository) {
		super(repository);
	}
}
