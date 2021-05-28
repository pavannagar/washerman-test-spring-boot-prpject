package com.dhakad.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@JsonIgnoreProperties(allowSetters = true,value = "ratelist")
public class Category {
	@Id
	private int categoryId;
	private String categoryName;
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	private List<Ratelist> ratelist = new ArrayList<>();;
	
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<Ratelist> getRatelist() {
		return ratelist;
	}
	public void setRatelist(List<Ratelist> ratelist) {
		this.ratelist = ratelist;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", ratelist=" + ratelist + "]";
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int categoryId, String categoryName, List<Ratelist> ratelist) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.ratelist = ratelist;
	}
	public Category(int categoryId) {
		super();
		this.categoryId = categoryId;
	}
	
	
	//{CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH}
	
	
	
}
