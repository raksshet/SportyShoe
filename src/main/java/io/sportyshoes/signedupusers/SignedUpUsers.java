package io.sportyshoes.signedupusers;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class SignedUpUsers {
	
	@Id
    private String id;
     
    @Column(nullable = false, unique = true, length = 45)
    private String email;
     
      
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;
     
    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;
    
    @Column(name = "signedup_date", nullable = false, length = 20)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
    private Date signedUpDate;

	public SignedUpUsers(String id, String email, String firstName, String lastName, Date signedUpDate) {
		super();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.signedUpDate = signedUpDate;
	}
	
	public SignedUpUsers() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getSignedUpDate() {
		return signedUpDate;
	}

	public void setSignedUpDate(Date signedUpDate) {
		this.signedUpDate = signedUpDate;
	}
    
    
    
    
	
	

}
