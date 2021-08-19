package io.sportyshoes.purchase;





import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Purchase {
	
	@Id
	private String purchaseId;
	private String purchaseUser;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date purchasedDate;
	private String category;
	private String productId;
	
	
	public Purchase() {
		super();
		
	}
	
	
	public Purchase(String purchaseId, String purchaseUser, Date purchasedDate, String category, String productId) {
		super();
		this.purchaseId = purchaseId;
		this.purchaseUser = purchaseUser;
		this.purchasedDate = purchasedDate;
		this.category = category;
		this.productId = productId;
	}
	
	
	public String getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getPurchaseUser() {
		return purchaseUser;
	}
	public void setPurchaseUser(String purchaseUser) {
		this.purchaseUser = purchaseUser;
	}
	public Date getPurchasedDate() {
		return purchasedDate;
	}
	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	
	
	
	
	
}
