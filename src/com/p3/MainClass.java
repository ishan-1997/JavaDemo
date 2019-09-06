package com.p3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		Car c = new HatchBack(10);
		Car s = new SportsCar(100);
		Car c2 = new Car();
		c.setName("Polo");
		s.setName("Porsche");
		c2.setName("Honda");
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(c);
		session.save(c2);
		session.save(s);
		
		t.commit();
		session.close();
		
	}
}
