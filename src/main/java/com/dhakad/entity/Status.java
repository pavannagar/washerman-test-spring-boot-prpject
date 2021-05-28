package com.dhakad.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Status {

	@Id
	private int statusId;
	private String statusValue;
	@JsonIgnore
	@OneToOne(mappedBy = "status",cascade = CascadeType.ALL)
	private Order_Table order_table;
	
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getStatusValue() {
		return statusValue;
	}
	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}
	public Order_Table getOrder_table() {
		return order_table;
	}
	public void setOrder_table(Order_Table order_table) {
		this.order_table = order_table;
	}
	
	
	
	
	
}
