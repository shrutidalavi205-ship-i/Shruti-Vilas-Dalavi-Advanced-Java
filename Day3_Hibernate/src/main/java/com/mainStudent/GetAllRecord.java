package com.mainStudent;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entityStudent.Student;

public class GetAllRecord {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// select * from student

		String hqlQuery = "from Student";
		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		List<Student> list = query.getResultList();

		for (Student employee : list) {
			System.out.println(employee);
		}

		tr.commit();
		ss.close();

	}
}
