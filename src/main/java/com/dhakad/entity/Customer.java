package com.dhakad.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {

	@Id
	private int customerId;
	private String Name;
	private String email;
	private String password;
	private String mobileNumber1;
	private String mobileNumber2;
	private String address;
	private String state;
	private String district;
	private String city;
	private String pincode;
	private String houseNumber;
	private String street;
	private String landmark;
	@JsonIgnore
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Order_Table> order_table;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber1() {
		return mobileNumber1;
	}
	public void setMobileNumber1(String mobileNumber1) {
		this.mobileNumber1 = mobileNumber1;
	}
	public String getMobileNumber2() {
		return mobileNumber2;
	}
	public void setMobileNumber2(String mobileNumber2) {
		this.mobileNumber2 = mobileNumber2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public List<Order_Table> getOrder_table() {
		return order_table;
	}
	public void setOrder_table(List<Order_Table> order_table) {
		this.order_table = order_table;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", Name=" + Name + ", email=" + email + ", password=" + password
				+ ", mobileNumber1=" + mobileNumber1 + ", mobileNumber2=" + mobileNumber2 + ", address=" + address
				+ ", state=" + state + ", district=" + district + ", city=" + city + ", pincode=" + pincode
				+ ", houseNumber=" + houseNumber + ", street=" + street + ", landmark=" + landmark + ", order_table="
				+ order_table + "]";
	}
	
	
	
	
}
