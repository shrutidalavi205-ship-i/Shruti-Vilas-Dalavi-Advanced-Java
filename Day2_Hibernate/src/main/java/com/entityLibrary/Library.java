package com.entityLibrary;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="library_details")
public class Library {

	private String libname;
	private String empOfLib;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mobNo;
	private int totalBooks;
	private int section;

	public Library() {
		super();
	}

	public Library(String libname, String empOfLib, long mobNo, int totalBooks, int section) {
		super();
		this.libname = libname;
		this.empOfLib = empOfLib;
		this.mobNo = mobNo;
		this.totalBooks = totalBooks;
		this.section = section;
	}

	public String getLibname() {
		return libname;
	}

	public void setLibname(String libname) {
		this.libname = libname;
	}

	public String getEmpOfLib() {
		return empOfLib;
	}

	public void setEmpOfLib(String empOfLib) {
		this.empOfLib = empOfLib;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public int getTotalBooks() {
		return totalBooks;
	}

	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Library [libname=" + libname + ", empOfLib=" + empOfLib + ", mobNo=" + mobNo + ", totalBooks="
				+ totalBooks + ", section=" + section + "]";
	}

}
