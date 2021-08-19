package io.sportyshoes.signedupusers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.sportyshoes.product.Product;
import io.sportyshoes.product.ProductService;

@RestController
public class SignedUpController {
	
	@Autowired
	private SignedUpService signedupservice;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/signedupusers")
	public List<SignedUpUsers> getAllSignedUpUsers() {
		
		return signedupservice.getAllSignedUpUsers();
				
	}
	
	
@RequestMapping("signedupusers/{id}")
	
	public SignedUpUsers getSignedUpUsers(@PathVariable String id) {
		
		return signedupservice.getSignedUpUsers(id);
	}
	

@RequestMapping(method=RequestMethod.POST, value="/signedupusers")
public void addSignedUpUsers(@RequestBody SignedUpUsers signedupuser) {
	signedupservice.addSignedUpUsers(signedupuser);
	
}

@RequestMapping(method=RequestMethod.GET, value="/signedupusers/Fname/{fName}")
public List<SignedUpUsers> getSignedUpUser(@PathVariable String fName) {
	
	return signedupservice.getSignedUpUser(fName);
			
}

}
