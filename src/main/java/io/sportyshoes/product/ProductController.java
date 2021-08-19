package io.sportyshoes.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import io.sportyshoes.category.Category;


@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET, value="/categories/{categoryId}/products")
	public List<Product> getAllProducts() {
		
		return productService.getAllProducts();
				
	}
	
	@RequestMapping("/products/{id}")
	
	public Product getProduct(@PathVariable String id) {
		
		return productService.getProduct(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/categories/{categoryId}/products")
	public void addProduct(@RequestBody Product product,@PathVariable String categoryId) {
		product.setCategory(new Category(categoryId,""));
		productService.addProduct(product);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/products/{id}")
	public void updateProduct(@RequestBody Product product,@PathVariable String id) {
		productService.updateProduct(id,product);
		
	}
	
@RequestMapping(method=RequestMethod.DELETE,value="/products/{id}")
	
	public void deleteProduct(@PathVariable String id) {
		
		 productService.deleteProduct(id);
	}

}
