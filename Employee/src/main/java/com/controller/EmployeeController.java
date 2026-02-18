package com.controller;

import java.util.Scanner;

import com.pojo.PojoClass;
import com.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) throws Exception {

		EmployeeService es = new EmployeeService();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("MENU");
			System.out.println("1 Insert Employee");
			System.out.println("2.Fetch Emplyees");
			System.out.println("3.Update Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Exit");

			System.out.println("Enter Choice:");

			int ch = sc.nextInt();
			switch (ch) {

			case 1:
				System.out.println("Enter Id = ");
				int id = sc.nextInt();

				System.out.println("Enter Name = ");
				String name = sc.next();

				System.out.println("Enter Salary = ");
				String salary = sc.next();

				System.out.println("Enter City = ");
				String city = sc.next();

				System.out.println("Enter Joining Date = ");
				String jDate = sc.next();

				System.out.println("Enter Mobile Number = ");
				String mobNo = sc.next();

				System.out.println("Enter Email = ");
				String email = sc.next();

				System.out.println("Enter Department = ");
				String dept = sc.next();

				System.out.println("Enter Position = ");
				String position = sc.next();

				System.out.println("Enter Your Experience = ");
				String experience = sc.next();

				es.insertData1(id, name, salary, city, jDate, mobNo, email, dept, position, experience);

				break;

			case 2:

				System.out.println("Your Record is...");
//				sc.next();
				es.fetchAllRecord();

				break;

			case 3:

				System.out.println("Enter id =");
				int id1 = sc.nextInt();

				System.out.println("Enter new salary");
				String sal = sc.next();

				es.updateData1(id1,sal);


				break;

			case 4:

				System.out.println("Enter ID to Delete");

				int idd = sc.nextInt();
				es.deleteData1(idd);

				System.out.println("Your Data is Deleted...!");

				break;

			case 5:

				System.out.println("Exit");
				System.exit(0);

				break;

			default:
				System.out.println("The Choice is not in code");

			}

		}

	}
}
