package com.supermarketapp;

public class Menu {
	private String product_name;
	private String quantity;
	private String brand;	
	private int price;
	
	
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	


@Override
public String toString() {
	return "Menu [product_name=" + product_name + ", quantity=" + quantity + ", brand=" + brand + ", price=" + price
			+ "]";
}
}
