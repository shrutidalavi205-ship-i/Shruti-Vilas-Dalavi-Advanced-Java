package com.controllerCollege;

import com.serviceCollege.LibraryService;

public class CollegeController {

	public static void main(String[] args) throws Exception {

		LibraryService ls = new LibraryService();

		ls.insertData();
//
//		s.updateData();
//
//		ls.deleteData();
//
//		ls.fetchAllData();

	}

}

//Enter password: ****
//Welcome to the MySQL monitor.  Commands end with ; or \g.
//Your MySQL connection id is 38
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
//| batch425           |
//| bsdatabase         |
//| emp                |
//| information_schema |
//| mysql              |
//| performance_schema |
//| sakila             |
//| sys                |
//| world              |
//+--------------------+
//10 rows in set (0.019 sec)
//
//mysql> use batch425;
//Database changed
//mysql> show tables;
//+--------------------+
//| Tables_in_batch425 |
//+--------------------+
//| college            |
//| employee           |
//| employee1          |
//| employee2          |
//| employee3          |
//| student            |
//+--------------------+
//6 rows in set (0.039 sec)
//
//mysql> desc College;
//+-------+-------------+------+-----+---------+----------------+
//| Field | Type        | Null | Key | Default | Extra          |
//+-------+-------------+------+-----+---------+----------------+
//| id    | int         | NO   | PRI | NULL    | auto_increment |
//| name  | varchar(50) | YES  |     | NULL    |                |
//| mobNo | varchar(15) | YES  | UNI | NULL    |                |
//| email | varchar(50) | YES  |     | NULL    |                |
//| city  | varchar(40) | YES  |     | NULL    |                |
//+-------+-------------+------+-----+---------+----------------+
//5 rows in set (0.021 sec)
//
//mysql> select * from employee;
//Empty set (0.028 sec)
//
//mysql> select * from college;
//+----+--------+------------+------------------+-------+
//| id | name   | mobNo      | email            | city  |
//+----+--------+------------+------------------+-------+
//|  1 | shruti | 4567892456 | shruti@gmail.com | miraj |
//+----+--------+------------+------------------+-------+
//1 row in set (0.006 sec)
//
//mysql>exit;