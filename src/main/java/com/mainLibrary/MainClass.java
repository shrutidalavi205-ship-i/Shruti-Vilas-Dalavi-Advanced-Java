package com.mainLibrary;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entityLibrary.Library;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(com.entityLibrary.Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Library l = new Library();
		l.setId(1);
		l.setName("vaishnavi");
		l.setEmail("vaish@gmail.com");
		l.setMobNo(5643278976l);
		l.setDegree("B.Sc CS");
		
//		ss.save(e);
		ss.persist(l);

		System.out.println("Data is Inserted ... !");
		tr.commit();
		ss.close();

	}
	
}
