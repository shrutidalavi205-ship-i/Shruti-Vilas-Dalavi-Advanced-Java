package com.mainStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityStudent.Student;

public class GetSingleData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// select * from employee where id = 3;

//		String hqlQuery = "from Student where id =: id";
//		org.hibernate.query.Query<Student> query = ss.createQuery(hqlQuery, Student.class);
//		query.setParameter("id", 3);
//		Student e = query.uniqueResult();
//		System.out.println(e);

		
		
//		String hqlQuery = "from Student where id =: id";
//		Query query1 = ss.createQuery(hqlQuery, Student.class);
//		query1.setParameter("id", 3);
//		Student e1 = (Student) query1.getSingleResult();
//		System.out.println(e1);

		tr.commit();
		ss.close();

	}
	
}
