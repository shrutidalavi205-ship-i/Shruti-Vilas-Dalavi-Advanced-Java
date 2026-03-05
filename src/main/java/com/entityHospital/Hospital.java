package com.entityHospital;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HospitalData")
public class Hospital {

	@Id
	private String hospitalName;
	private String pName;
	private int pId;
	private long hMobNo;
	private long pmobNo;
	
	public Hospital() {
		
	}

	public Hospital(String hospitalName, String pName, int pId, long hMobNo, long pmobNo) {
		super();
		this.hospitalName = hospitalName;
		this.pName = pName;
		this.pId = pId;
		this.hMobNo = hMobNo;
		this.pmobNo = pmobNo;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public long gethMobNo() {
		return hMobNo;
	}

	public void sethMobNo(long hMobNo) {
		this.hMobNo = hMobNo;
	}

	public long getPmobNo() {
		return pmobNo;
	}

	public void setPmobNo(long pmobNo) {
		this.pmobNo = pmobNo;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", pName=" + pName + ", pId=" + pId + ", hMobNo=" + hMobNo
				+ ", pmobNo=" + pmobNo + "]";
	}
	
	
	
}
