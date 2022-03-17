package com.supermarketapp.model;

public class Order {
	
	
    private String customerName;
    private String contactNumber;
    private String address;
    private String city;
    private String postalCode;
    private String country;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Order [customerName=" + customerName + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", city=" + city + ", postalCode=" + postalCode + ", country=" + country + "]";
	}
	
	
    

}
