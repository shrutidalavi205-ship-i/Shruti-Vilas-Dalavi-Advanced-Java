package com.controllerEmployee1;

import com.serviceEmployee1.Employee1Service;

public class Employee1Controller {

	public static void main(String[] args) throws Exception {

		Employee1Service es = new Employee1Service();

		es.insertData();
//
//		es.updateData();
//
//		es.deleteData();
//
//		es.fetchAllData();

	}

}

//Enter password: ****
//Welcome to the MySQL monitor.  Commands end with ; or \g.
//Your MySQL connection id is 31
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
//10 rows in set (0.028 sec)
//
//mysql> use batch425;
//Database changed
//mysql> show tables;
//+--------------------+
//| Tables_in_batch425 |
//+--------------------+
//| employee           |
//| employee1          |
//| employee2          |
//| employee3          |
//| student            |
//+--------------------+
//5 rows in set (0.031 sec)
//
//mysql> desc employee3;
//+------------+-------------+------+-----+---------+----------------+
//| Field      | Type        | Null | Key | Default | Extra          |
//+------------+-------------+------+-----+---------+----------------+
//| id         | int         | NO   | PRI | NULL    | auto_increment |
//| name       | varchar(50) | YES  |     | NULL    |                |
//| city       | varchar(30) | YES  |     | NULL    |                |
//| adharId    | bigint      | YES  |     | NULL    |                |
//| jDate      | varchar(20) | YES  |     | NULL    |                |
//| experience | varchar(30) | YES  |     | NULL    |                |
//| dept       | varchar(40) | YES  |     | NULL    |                |
//| position   | varchar(30) | YES  |     | NULL    |                |
//| mobNo      | bigint      | YES  |     | NULL    |                |
//| emailId    | varchar(40) | YES  |     | NULL    |                |
//+------------+-------------+------+-----+---------+----------------+
//10 rows in set (0.037 sec)
//
//mysql> select * from employee3;
//+----+--------+-------+--------------+------------+------------+-----------+-------------------+------------+------------------+
//| id | name   | city  | adharId      | jDate      | experience | dept      | position          | mobNo      | emailId          |
//+----+--------+-------+--------------+------------+------------+-----------+-------------------+------------+------------------+
//|  1 | Shruti | Miraj | 237767834563 | 2023-08-21 | 2 years    | Developer | Jr.Java Developer | 4534563467 | shruti@gmail.com |
//+----+--------+-------+--------------+------------+------------+-----------+-------------------+------------+------------------+
//1 row in set (0.007 sec)
//
//mysql> exit;