package com.supermarketapp.model;

public class Order {
	
	private static String address;
    private static String city;
    private static String postalCode;
   // private static String country;
    private String items;
    private static int price; 
    private String discount ;
    private String deliveryCharge;
    private int totalAmount;
	
	public static String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		Order.address = address;
	}
	public static String getCity() {
		return city;
	}
	public void setCity(String city) {
		Order.city = city;
	}
	public static String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		Order.postalCode = postalCode;
	}
/*	public static String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}*/
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public static int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(String deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Order [address=" + address + ", city=" + city + ", postalCode=" + postalCode + ","
				+ "+ items=" + items + ", price=" + price + ", discount=" + discount + ", deliveryCharge="
				+ deliveryCharge + ", totalAmount=" + totalAmount + "]";
	}
	
}
