package io.sportyshoes.product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String>  {
	
	
}
