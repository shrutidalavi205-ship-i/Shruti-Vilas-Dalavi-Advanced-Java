package com.entityLibrary;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libraryData")
public class Library {

	@Id
	private int id;
	private String name;
	private String email;
	private long mobNo;
	private String degree;
	
	public Library() {
		
	}

	public Library(int id, String name, String email, long mobNo, String degree) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobNo = mobNo;
		this.degree = degree;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", email=" + email + ", mobNo=" + mobNo + ", degree=" + degree
				+ "]";
	}
	
	
	
}
