package com.entityEmployee;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="employee6")
	public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int empId;
		private String name;
		private double salary;
		@Column(unique = true, nullable = false)
		private String email;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Employee() {

		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
		public Employee(int empId, String name, String city, String email, double salary) {
			super();
			this.empId = empId;
			this.name = name;
			this.email = email;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name  + ", email=" + email + ", salary="
					+ salary + "]";
		}

	}
	
