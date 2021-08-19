package io.sportyshoes.signedupusers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SignedUpService {
	
	@Autowired
	private SignedUpRepository signeduprepository;
	
	
public List<SignedUpUsers> getAllSignedUpUsers(){
		
		List<SignedUpUsers> signedupusers = new ArrayList<>();
		signeduprepository.findAll()
		.forEach(signedupusers::add);
		
		return signedupusers;
	}

public void addSignedUpUsers(SignedUpUsers signedupusers) {
	signeduprepository.save(signedupusers);
	
}

public SignedUpUsers  getSignedUpUsers(String id) {
	// TODO Auto-generated method stub
	 return signeduprepository.findById(id).get();
}

public List<SignedUpUsers> getSignedUpUser(String fName) {
	// TODO Auto-generated method stub
	return signeduprepository.findByfirstNameContaining(fName);
}

	
	

}
