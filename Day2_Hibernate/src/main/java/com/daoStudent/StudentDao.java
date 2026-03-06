package com.daoStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityEmployee.Employee;
import com.entityStudent.Student;

public class StudentDao {

	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();
		s.setCity("Miraj");
		s.setEmail("shruti@gmail.com");
		s.setStudId(1);
		s.setName("shruti");
		s.setMobNo(5676567657l);
		ss.save(s);
//		ss.persist(s);

		tr.commit();
		ss.close();
		System.out.println("Data is Inserted ... !");
	}

	public void deleteData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 6;
		Student s1 = ss.get(Student.class, id);

//		ss.delete(s1);
		ss.remove(s1);
		System.out.println("Data is deleted ... !");

		tr.commit();
		ss.close();

	}

	public void updateData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;
		Student s1 = ss.get(Student.class, id);
		s1.setName("OM");
		s1.setCity("nsk");
		s1.setEmail("om@gmail.com");
		s1.setMobNo(7659845678l);

//             ss.update(e1);     
		ss.merge(s1);

//			
		System.out.println("Data is updated ... !");

		tr.commit();
		ss.close();

	}

	public void getSingleRecord() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;
		Student s1 = ss.get(Student.class, id);
		System.out.println(s1);

		tr.commit();
		ss.close();

	}
}