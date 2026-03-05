package com.mainVehical;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityVehical.Vehical;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(com.entityVehical.Vehical.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Vehical v = new Vehical();
		v.setNum(8080);
		v.setBrand("Tata");
		v.setName("Indica");
		v.setSpeed("120");
		v.setColor("White");
		
//		ss.save(e);
		ss.persist(v);

		System.out.println("Data is Inserted ... !");
		tr.commit();
		ss.close();

	}
	
}
