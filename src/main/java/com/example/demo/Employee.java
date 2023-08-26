package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
//@Data
public class Employee {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSuggestion_Category() {
		return suggestion_Category;
	}
	public void setSuggestion_Category(String suggestion_Category) {
		this.suggestion_Category = suggestion_Category;
	}
	public String getSuggestion_Description() {
		return suggestion_Description;
	}
	public void setSuggestion_Description(String suggestion_Description) {
		this.suggestion_Description = suggestion_Description;
	}
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String department;
//	private String project;
	private String location;
//	private String  innovation;
//	private String culture;
//	private String policies;
	private String suggestion_Category;
	private String suggestion_Description;
	
	
}
