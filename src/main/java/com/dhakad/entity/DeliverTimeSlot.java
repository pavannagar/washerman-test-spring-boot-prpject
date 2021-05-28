package com.dhakad.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DeliverTimeSlot {

	@Id
	private int deliverTimeId;
	private String timeSlot;
	@JsonIgnore
	@OneToOne(mappedBy = "deliverTimeSlot",cascade = CascadeType.ALL)
	private Order_Table order_table;
	public int getDeliverTimeId() {
		return deliverTimeId;
	}
	public void setDeliverTimeId(int deliverTimeId) {
		this.deliverTimeId = deliverTimeId;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public Order_Table getOrder_table() {
		return order_table;
	}
	public void setOrder_table(Order_Table order_table) {
		this.order_table = order_table;
	}
	
	
	
}
