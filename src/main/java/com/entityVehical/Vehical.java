package com.entityVehical;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VehicalData")
public class Vehical {

	private String name;
	@Id
	private int num;
	private String brand;
	private String color;
	private String speed;
	
	
	public Vehical() {
		
	}


	public Vehical(String name, int num, String brand, String color, String speed) {
		super();
		this.name = name;
		this.num = num;
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSpeed() {
		return speed;
	}


	public void setSpeed(String speed) {
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "Vehical [name=" + name + ", num=" + num + ", brand=" + brand + ", color=" + color + ", speed=" + speed
				+ "]";
	}
	
	
	
}
