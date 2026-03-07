package com.entityStudent;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student1")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String city;
	@Column(unique = true, nullable = false)
	private String email;
	
	
	public Student() {
		
	}


	public Student(int id, String name, String city, String email) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
		this.email = email;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", city=" + city + ", email=" + email + "]";
	}
	
	
	
}