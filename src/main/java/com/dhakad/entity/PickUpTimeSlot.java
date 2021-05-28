package com.dhakad.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PickUpTimeSlot {

	@Id
	private int pickUpTimeId;
	private String timeSlot;
	@JsonIgnore
	@OneToOne(mappedBy = "pickUpTimeSlot",cascade = CascadeType.ALL)
	private Order_Table order_table;
	
	public int getPickUpTimeId() {
		return pickUpTimeId;
	}
	public void setPickUpTimeId(int pickUpTimeId) {
		this.pickUpTimeId = pickUpTimeId;
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



