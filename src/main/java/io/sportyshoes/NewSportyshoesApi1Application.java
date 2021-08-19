package io.sportyshoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class NewSportyshoesApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(NewSportyshoesApi1Application.class, args);
	}

}
