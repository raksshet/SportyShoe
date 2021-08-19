package io.sportyshoes.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository productrepository;
	
	
	
	public List<Product> getAllProducts(){
		
		List<Product> products = new ArrayList<>();
		productrepository.findAll()
		.forEach(products::add);
		
		return products;
	}
	
	public Product getProduct(String id) {
		
		
		return productrepository.findById(id).get();
 

	}

	public void addProduct(Product product) {
		productrepository.save(product);
		
	}

	public void updateProduct(String id, Product product) {
		
		productrepository.save(product);
		
	}

	public void  deleteProduct(String id) {
		
		productrepository.deleteById(id);
			
	}
	
	

}
