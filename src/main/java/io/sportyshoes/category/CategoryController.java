package io.sportyshoes.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import io.sportyshoes.product.Product;



@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(method=RequestMethod.GET, value="/categories")
	public List<Category> getAllCategory() {
		
		return categoryService.getAllCategory();
				
	}
	
@RequestMapping("/products/{productid}/categories/{id}")
	
	public Category getCategory(@PathVariable String id) {
		
		return categoryService.getCategory(id);
	}

@RequestMapping(method=RequestMethod.POST, value="/categories")
public void addCategory(@RequestBody Category category ) {
	categoryService.addCategory(category);
	
}

@RequestMapping(method=RequestMethod.PUT, value="/categories/{id}")
public void updatecourse(@RequestBody Category category) {
	categoryService.addCategory(category);
	
	
}

@RequestMapping(method=RequestMethod.DELETE,value="/products/{productId}/categories/{id}")

public void deleteCategory(@PathVariable String id) {
	
	categoryService.deleteCategory(id);
}

}


