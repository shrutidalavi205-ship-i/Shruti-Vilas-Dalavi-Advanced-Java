package com.mainEmployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityEmployee.Employee;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(com.entityEmployee.Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmpId(111);
		e.setName("shruti");
		e.setCity("miraj");
		e.setSalary(5625.67);

//		ss.save(e);
		ss.persist(e);

		System.out.println("Data is Inserted ... !");
		tr.commit();
		ss.close();

	}
}