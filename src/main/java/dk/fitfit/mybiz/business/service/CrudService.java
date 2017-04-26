package dk.fitfit.mybiz.business.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public abstract class CrudService<T, ID extends Serializable> implements CrudServiceInterface<T, ID> {
	private JpaRepository<T, ID> repository;

	CrudService(JpaRepository<T, ID> repository) {
		this.repository = repository;
	}

	@Override
	public T findOne(ID id) {
		return repository.findOne(id);
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public T save(T entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(ID id) {
		repository.delete(id);
	}
}
