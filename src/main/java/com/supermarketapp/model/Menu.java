package com.supermarketapp.model;

public class Menu {
	
	private String productName;
	private String brand;	
	private String quantity;
	private int price;
	
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	


@Override
public String toString() {
	return "Menu [productName=" + productName + " , brand=" + brand + ",quantity="+ quantity+", price=" + price+ "]";
}

 
}
