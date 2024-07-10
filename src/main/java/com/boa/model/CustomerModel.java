package com.boa.model;

public class CustomerModel {
	
	private int customerID;
	private String customerName;
	private String customerAddress;
	public CustomerModel(int customerID, String customerName, String customerAddress) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		// TODO Auto-generated constructor stub
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	@Override
	public String toString() {
		return "CustomerModel{" + "CustomerID=" + customerID + ",customerName=" +customerName + '\'' +'}'; 
		
	}
	

}
