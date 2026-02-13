package com.daoEmployee1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee1Dao {

	public void fetchAllRecord() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		Statement s = c.createStatement();

		ResultSet rs = s.executeQuery("select * from Employee3");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
					+ rs.getBigDecimal(4) + "  " + rs.getString(5) + "  " + rs.getString(6) + "  " + rs.getString(7)
					+ "  " + rs.getString(8) + "  " + rs.getBigDecimal(9) + "  " + rs.getString(10));

		}

		c.close();

	}

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		Statement s = c.createStatement();

		int check = s.executeUpdate(
				"insert into Employee3(name,city,adharId,jDate,experience,dept,position,mobNo,emailId)values('Shruti','Miraj',237767834563,'2023-08-21','2 years','Developer','Jr.Java Developer',4534563467,'shruti@gmail.com')");

		if (check > 0) {

			System.out.println("Data is Inserted...!");

		} else {

			System.err.println("Data is NOT INSERTED..!");

		}

		c.close();

	}

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		Statement s = c.createStatement();

		int check = s.executeUpdate("update Employee3 set name = 'Onkar' where id =1");

		if (check > 0) {

			System.out.println("Data is Updated...!");

		} else {

			System.err.println("Data is Not Updated...!");

		}

		c.close();

	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		Statement s = c.createStatement();

		int check = s.executeUpdate("delete from Employee3 where id = 1");

		if (check > 0) {

			System.out.println("Data is Deleted...!");

		} else {

			System.err.println("Data is Not Deleted...!");

		}

		c.close();

	}

}
