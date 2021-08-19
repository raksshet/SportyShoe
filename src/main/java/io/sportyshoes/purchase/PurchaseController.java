package io.sportyshoes.purchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.sportyshoes.category.Category;
import io.sportyshoes.product.Product;
import io.sportyshoes.product.ProductService;

@RestController
public class PurchaseController {
	
	@Autowired
	private PurchaseService purchaseService;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/purchases")
	public List<Purchase> getAllPurchase() {
		
		return purchaseService.getAllPurchases();
				
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/purchases")
	public void addPurchase(@RequestBody Purchase purchase) {
		
		purchaseService.addPurchase(purchase);
		
	}
	
	@RequestMapping("/purchase/stats/{days}")
    public List<Purchase> findAllByDateBetween(@PathVariable int days){
        return purchaseService.findAllByDateBetween(days);
    }
	

}
