package io.sportyshoes.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import io.sportyshoes.category.Category;

@Entity
public class Product {
	
	@Id
	private String id;
	private String description;
	private String name;
	
	@OneToOne
	
	private Category category;
	
	public Product() {
		super();
	}
	
		
	public Product(String id, String description, String name, String categoryId) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.category= new Category(categoryId,"");
	}



	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
