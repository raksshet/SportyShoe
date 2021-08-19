package io.sportyshoes.purchase;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, String> {
	
	List<Purchase> findAllBypurchasedDateBetween(Date today, Date days);
	
	
	
	

}
