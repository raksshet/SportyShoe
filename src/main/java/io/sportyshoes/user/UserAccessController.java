package io.sportyshoes.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserAccessController {
	
	@Autowired
    private UserRepository userRepo;
	
	@GetMapping("")
    public String viewHomePage() {
        return "index";
    }
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
	    model.addAttribute("user", new Users());
	     
	    return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(Users user) {
	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encodedPassword = passwordEncoder.encode(user.getPassword());
	    user.setPassword(encodedPassword);
	     
	    userRepo.save(user);
	     
	    return "register_success";
	}
	
	@GetMapping("/updatepwd")
	public String showUpdatePasswordForm(Model model) {
	    model.addAttribute("user", new Users());
	     
	    return "updatepwd";
	}
	
	@PostMapping("/process_password")
	public String processPassword(Users user) {
		
		String username =user.getEmail();
		
		Users updateduser = userRepo.findByEmail(username);
		
				
	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encodedPassword = passwordEncoder.encode(user.getPassword());
	    user.setPassword(encodedPassword);
	    
	    updateduser.setPassword(encodedPassword);
	     
	    userRepo.save(updateduser);
	     
	    return "password_success";
	}
	

	@GetMapping("/users")
	public String listUsers(Model model) {
	    List<Users> listUsers = userRepo.findAll();
	    model.addAttribute("listUsers", listUsers);
	     
	    return "users";
	}
	
}
