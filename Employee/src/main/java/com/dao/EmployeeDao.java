package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.pojo.PojoClass;

public class EmployeeDao {

	public void fetchAllRecord(PojoClass p) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		PreparedStatement ps = c.prepareStatement("select * from Employee");

//		ps.setInt(1, p.getId());
				ResultSet rs = ps.executeQuery();
				

		while (rs.next()) {

			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4)
					+ "  " + rs.getString(5) + "  " + rs.getString(6) + " " + rs.getString(7) + "  " + rs.getString(8)
					+ "  " + rs.getString(9) + "  " + rs.getString(10));

		}

		c.close();

	}

	public void insertData1(PojoClass p) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		PreparedStatement ps = c.prepareStatement(
				"insert into Employee(id,name,salary,city,jDate,mobNo,email,dept,position,experience)values(?,?,?,?,?,?,?,?,?,?)");

		ps.setInt(1, p.getId());
		ps.setString(2, p.getName());
		ps.setString(3, p.getSalary());
		ps.setString(4, p.getCity());
		ps.setString(5, p.getjDate());
		ps.setString(6, p.getMobNo());
		ps.setString(7, p.getEmail());
		ps.setString(8, p.getDept());
		ps.setString(9, p.getPosition());
		ps.setString(10, p.getExperience());
		
		int check = ps.executeUpdate();

		if (check > 0) {

			System.out.println("Data is Inserted...!");

		} else {

			System.out.println("Data is NOT Inserted...!");

		}

		c.close();

	}

	public void updateDate1(PojoClass p) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		PreparedStatement ps = c.prepareStatement("update Employee set name = ? where id =?");

		ps.setString(1, p.getName());
		ps.setInt(2, p.getId());

		int check = ps.executeUpdate();

		if (check > 0) {

			System.out.println("Data is updated...!");

		} else {

			System.out.println("Data is NOT Updated...!");

		}

		c.close();

	}

	public void deleteData1(PojoClass p) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		PreparedStatement ps = c.prepareStatement("delete from Employee where id =?");

		ps.setInt(1, p.getId());

		int check = ps.executeUpdate();

		if (check > 0) {

			System.out.println("Data is Deleted...!");

		} else {

			System.out.println("Data is NOT Deleted...!");

		}

		c.close();

	}

	public void dropTable(PojoClass p) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		Statement s = c.createStatement();

		boolean check = s.execute("drop table Employee");

		if (check == true) {

			System.out.println("Table drop Failed...!");

		} else {

			System.out.println("Table Droped...!");

		}

		c.close();

	}

}
