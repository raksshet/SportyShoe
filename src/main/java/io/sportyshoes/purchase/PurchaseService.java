package io.sportyshoes.purchase;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sportyshoes.product.Product;
import io.sportyshoes.product.ProductRepository;

@Service
public class PurchaseService {
	
	@Autowired
	private PurchaseRepository purchaserepository;
	
	public List<Purchase> getAllPurchases(){
		
		List<Purchase> purchase = new ArrayList<>();
		purchaserepository.findAll()
		.forEach(purchase::add);
		
		return purchase;
	}
	
	
	public void addPurchase(Purchase purchase) {
		purchaserepository.save(purchase);
		
	}
	
	public List<Purchase> findAllByDateBetween(int days){
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();

        calendar.add(Calendar.DAY_OF_MONTH, -days);
        Date beforeDays = calendar.getTime();
        return purchaserepository.findAllBypurchasedDateBetween(beforeDays,today);
    }

}
