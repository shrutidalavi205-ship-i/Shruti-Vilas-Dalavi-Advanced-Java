package com.daoLibrary;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityLibrary.Library;

public class LibraryDao {

	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Library l = new Library();
		l.setEmpOfLib("45");		
		l.setLibname("Ch.Shivaji Maharaj Library");
		l.setMobNo(4564567890l);
		l.setSection(10);
		l.setTotalBooks(50000);
		
		ss.save(l);
//		ss.persist(l);

		tr.commit();
		ss.close();
		System.out.println("Data is Inserted ... !");
	}

	public void deleteData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 6;
		Library l1 = ss.get(Library.class, id);

//		ss.delete(s1);
		ss.remove(l1);
		System.out.println("Data is deleted ... !");

		tr.commit();
		ss.close();

	}

	public void updateData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;
		Library l1 = ss.get(Library.class, id);
		l1.setEmpOfLib("3");
		
//             ss.update(e1);     
		ss.merge(l1);

//			
		System.out.println("Data is updated ... !");

		tr.commit();
		ss.close();

	}

	public void getSingleRecord() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;
		Library l1 = ss.get(Library.class, id);
		System.out.println(l1);

		tr.commit();
		ss.close();

	}
}