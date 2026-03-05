package com.mainStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityStudent.Student;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(com.entityStudent.Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();		
		s.setStudId(1);
		s.setStudName("Shruti");
		s.setEmail("shruti@gmail.com");
		s.setMobNo(4567890987l);
		s.setEducation("B.Sc CS");
		
//		ss.save(e);
		ss.persist(s);

		System.out.println("Data is Inserted ... !");
		tr.commit();
		ss.close();

	}
	
}
