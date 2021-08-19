package io.sportyshoes.category;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import io.sportyshoes.product.Product;

@Entity
public class Category {
	
	@Id
	private String id;
	private String name;
		
	public Category() {
		super();
	};
	
	public Category(String id,  String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
