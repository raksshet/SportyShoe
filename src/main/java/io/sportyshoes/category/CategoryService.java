package io.sportyshoes.category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategory() {

		List<Category> category = new ArrayList<>();
		
		categoryRepository.findAll()
		.forEach(category::add);
		return category;
	}

	public Category getCategory(String id) {
		return categoryRepository.findById(id).get();
	}

	public void addCategory(Category category) {
		categoryRepository.save(category);
		
	}

	public void updateCategory(String id,Category category) {
		
		categoryRepository.save(category);
		
	}

	public void  deleteCategory(String id) {
		
		categoryRepository.deleteById(id);
			
	}
}
