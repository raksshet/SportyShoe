package io.sportyshoes.users.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import io.sportyshoes.user.UserRepository;
import io.sportyshoes.user.Users;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

	 @Autowired
	    private TestEntityManager entityManager;
	     
	    @Autowired
	    private UserRepository repo;
	    
	    @Test
	    public void testCreateUser() {
	        Users user = new Users();
	        user.setEmail("rakshith@gmail.com");
	        user.setPassword("rakshith123");
	        user.setFirstName("Rakshith");
	        user.setLastName("Shetty");
	         
	        Users savedUser = repo.save(user);
	         
	        Users existUser = entityManager.find(Users.class, savedUser.getId());
	         
	        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
	         
	    }
	
	

}
