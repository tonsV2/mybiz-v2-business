package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Product;
import dk.fitfit.mybiz.business.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends CrudService<Product, Long> implements ProductServiceInterface {
	public ProductService(ProductRepository repository) {
		super(repository);
	}
}
