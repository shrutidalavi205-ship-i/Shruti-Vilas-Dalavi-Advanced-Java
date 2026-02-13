package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		Statement s = c.createStatement();

		s.executeUpdate("insert into student(id,name,city)values(1,'shruti','miraj')");

		System.out.println("Data is Inserted...!");

		c.close();

	}

}



//Enter password: ****
//Welcome to the MySQL monitor.  Commands end with ; or \g.
//Your MySQL connection id is 9
//Server version: 9.6.0 MySQL Community Server - GPL
//
//Copyright (c) 2000, 2026, Oracle and/or its affiliates.
//
//Oracle is a registered trademark of Oracle Corporation and/or its
//affiliates. Other names may be trademarks of their respective
//owners.
//
//Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.
//
//mysql> show databases;
//+--------------------+
//| Database           |
//+--------------------+
//| batch1299          |
//| bsdatabase         |
//| emp                |
//| information_schema |
//| mysql              |
//| performance_schema |
//| sakila             |
//| sys                |
//| world              |
//+--------------------+
//9 rows in set (0.648 sec)
//
//mysql> create database batch425;
//Query OK, 1 row affected (0.283 sec)
//
//mysql> use batch425;
//Database changed
//mysql> show tables;
//Empty set (0.149 sec)
//
//mysql> create student(id int,name varchar(40),city varchar(30));
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'student(id int,name varchar(40),city varchar(30))' at line 1
//mysql> create table student(id int,name varchar(40),city varchar(30));
//Query OK, 0 rows affected (0.414 sec)
//
//mysql> desc student;
//+-------+-------------+------+-----+---------+-------+
//| Field | Type        | Null | Key | Default | Extra |
//+-------+-------------+------+-----+---------+-------+
//| id    | int         | YES  |     | NULL    |       |
//| name  | varchar(40) | YES  |     | NULL    |       |
//| city  | varchar(30) | YES  |     | NULL    |       |
//+-------+-------------+------+-----+---------+-------+
//3 rows in set (0.097 sec)
//
//mysql> select * from student;
//+------+--------+-------+
//| id   | name   | city  |
//+------+--------+-------+
//|    1 | shruti | miraj |
//+------+--------+-------+
//1 row in set (0.006 sec)
//
//mysql>exit;
