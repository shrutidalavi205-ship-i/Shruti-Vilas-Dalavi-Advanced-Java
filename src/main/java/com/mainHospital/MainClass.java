package com.mainHospital;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityHospital.Hospital;


public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(com.entityHospital.Hospital.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Hospital h = new Hospital();
		h.setHospitalName("Kadam Hospital");
		h.sethMobNo(4534567890l);
		h.setpName("Swati");
		h.setpId(1);
		h.setPmobNo(7867854367l);
		
//		ss.save(e);
		ss.persist(h);

		System.out.println("Data is Inserted ... !");
		tr.commit();
		ss.close();

	}
	
}
