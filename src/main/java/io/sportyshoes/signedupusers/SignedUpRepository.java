package io.sportyshoes.signedupusers;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.sportyshoes.product.Product;

public interface SignedUpRepository extends CrudRepository<SignedUpUsers, String> {
	
	public List< SignedUpUsers > findByfirstNameContaining( String name );

}
