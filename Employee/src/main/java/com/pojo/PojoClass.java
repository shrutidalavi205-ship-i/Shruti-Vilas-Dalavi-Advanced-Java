package com.pojo;

public class PojoClass {

	private int id;
	private String name;
	private String salary;
	private String city;
	private String jDate;
	private String mobNo;
	private String email;
	private String dept;
	private String position;
	private String experience;
	
	
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getjDate() {
		return jDate;
	}
	public void setjDate(String jDate) {
		this.jDate = jDate;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
	public PojoClass() {
		super();
	}
	
	public PojoClass(int id, String name, String salary, String city, String jDate, String mobNo, String email,
			String dept, String position, String experience) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.jDate = jDate;
		this.mobNo = mobNo;
		this.email = email;
		this.dept = dept;
		this.position = position;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "PojoClass [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + ", jDate=" + jDate
				+ ", mobNo=" + mobNo + ", email=" + email + ", dept=" + dept + ", position=" + position
				+ ", experience=" + experience + "]";
	}
	
	
	
	
	
	
}
