package com.supermarketapp.model;

public class Payment {
	private String items;
	private String paymentOption;
	private Integer price;
	private String deliveryCharge;
	private Integer amountpayable;
	
	public String getitems() {
		return items;
	}

	public void setItems(String items) {
		 this.items=items;
	}
	
	public String getPaymentOption() {
		return paymentOption;
	}
	
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(String deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	public Integer getAmountpayable() {
		return amountpayable;
	}
	public void setAmountpayable(Integer amountpayable) {
		this.amountpayable = amountpayable;
	}
	@Override
	public String toString() {
		return "Payment [ items=" + items + ",paymentOption=" + paymentOption + ", price=" + price + ", deliveryCharge=" + deliveryCharge
				+ ", amountpayable=" + amountpayable + "]";
	}
	 
	
	}
