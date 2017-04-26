package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Client;
import dk.fitfit.mybiz.business.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends CrudService<Client, Long> implements ClientServiceInterface {
	ClientService(ClientRepository repository) {
		super(repository);
	}
}
