package com.entityStudent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentData")
public class Student {

	private String studName;
	@Id
	private int studId;
	private String education;
	private String email;
	private long mobNo;
	
	public Student() {
		
	}

	public Student(String studName, int studId, String education, String email, long mobNo) {
		super();
		this.studName = studName;
		this.studId = studId;
		this.education = education;
		this.email = email;
		this.mobNo = mobNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
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

	@Override
	public String toString() {
		return "Student [studName=" + studName + ", studId=" + studId + ", education=" + education + ", email=" + email
				+ ", mobNo=" + mobNo + "]";
	}
	
	
	
}
