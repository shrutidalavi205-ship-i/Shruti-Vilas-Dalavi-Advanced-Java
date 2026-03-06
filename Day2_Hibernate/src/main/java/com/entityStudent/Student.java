package com.entityStudent;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Student {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int studId;
		private String name;
		private String city;
		private long mobNo;
		@Column(unique = true, nullable = false)
		private String email;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Student() {

		}

		public double getMobNo() {
			return mobNo;
		}

		public void setMobNo(long mobNo) {
			this.mobNo = mobNo;
		}

		public int getEmpId() {
			return studId;
		}

		public void setStudId(int studId) {
			this.studId = studId;
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

		public Student(int studId, String name, String city, String email, long mobNo) {
			super();
			this.studId = studId;
			this.name = name;
			this.city = city;
			this.email = email;
			this.mobNo = mobNo;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + studId + ", name=" + name + ", city=" + city + ", email=" + email + ", mobNo="
					+ mobNo + "]";
		}
	
}
