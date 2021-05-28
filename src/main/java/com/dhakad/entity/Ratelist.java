package com.dhakad.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
public class Ratelist {

	@Id
	private int id;
	private int price;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Cloth cloth;
	
	
	public Ratelist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	

	public Cloth getCloth() {
		return cloth;
	}
	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}
	@Override
	public String toString() {
		return "Ratelist [id=" + id + ", price=" + price + ", category=" + category + ", cloth=" + cloth + "]";
	}
	public Ratelist(int id, int price, Category category, Cloth cloth) {
		super();
		this.id = id;
		this.price = price;
		this.category = category;
		this.cloth = cloth;
	}
	public Ratelist(int id, int price) {
		super();
		this.id = id;
		this.price = price;
	}
	public Ratelist(int id) {
		super();
		this.id = id;
	}
	
	
	
	
}
