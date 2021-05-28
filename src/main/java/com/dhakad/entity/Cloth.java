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
@JsonIgnoreProperties(value = "ratelist",allowSetters = true)
public class Cloth {

	@Id
	private int clothId;
	private String clothName;
	//jsonignore
	@OneToMany(mappedBy = "cloth",cascade = CascadeType.ALL)
	private List<Ratelist> ratelist= new ArrayList<>();;
	
	
	public int getClothId() {
		return clothId;
	}
	public void setClothId(int clothId) {
		this.clothId = clothId;
	}
	public String getClothName() {
		return clothName;
	}
	public void setClothName(String clothName) {
		this.clothName = clothName;
	}
	
	public List<Ratelist> getRatelist() {
		return ratelist;
	}
	public void setRatelist(List<Ratelist> ratelist) {
		this.ratelist = ratelist;
	}
	@Override
	public String toString() {
		return "Cloth [clothId=" + clothId + ", clothName=" + clothName + ", ratelist=" + ratelist + "]";
	}
	public Cloth(int clothId, String clothName, List<Ratelist> ratelist) {
		super();
		this.clothId = clothId;
		this.clothName = clothName;
		this.ratelist = ratelist;
	}
	public Cloth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cloth(int clothId) {
		super();
		this.clothId = clothId;
	}
	
	
	
	
	
}
