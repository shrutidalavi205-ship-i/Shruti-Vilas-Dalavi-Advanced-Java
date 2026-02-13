package com.daocollege;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CollegeDao {

	public void fetchAllRecord() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		Statement s = c.createStatement();

		ResultSet rs = s.executeQuery("select * from College");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4)
					+ "  " + rs.getString(5));

		}

		c.close();

	}

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		Statement s = c.createStatement();

		int check = s.executeUpdate(
				"insert into College(name,mobNo,email,city)values('shruti','4567892456','shruti@gmail.com','miraj')");

		if (check > 0) {

			System.out.println("Data is Inserted...!");

		} else {

			System.err.println("Data is Not Inserted...!");

		}

		c.close();

	}

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		Statement s = c.createStatement();

		int check = s.executeUpdate("update College set name = 'Onkar' where id = 1");

		if (check > 0) {

			System.out.println("Data is updated...!");

		} else {

			System.err.println("Data is Not Inserted");

		}

	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		Statement s = c.createStatement();

		int check = s.executeUpdate("delete from College where id = 1");

		if (check > 0) {

			System.out.println("Data is Deleted...!");

		} else {

			System.err.println("Data is Not Deleted...!");

		}

		c.close();

	}

}
