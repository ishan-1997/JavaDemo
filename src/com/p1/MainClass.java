package com.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		MainClass m = new MainClass();

		//m.createSession("Ravi", 500);
		System.out.println(m.getSession(6));
		m.updateSession(5, "Hello");
		System.out.println(m.getSession(5));
		m.deleteSession(6);
	}
	
	public void createSession(String name, int sal) {
		Employee e = new Employee();
		e.setName(name);
		e.setSalary(sal);
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(e);
		t.commit();
		session.close();
		
	}
	
	public Employee getSession(int id) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Employee e2 = new Employee();
		Transaction t = session.beginTransaction();
		e2 = (Employee)session.get(Employee.class,id);
		session.close();
		return(e2);
	}
	
	public void updateSession(int id, String name) {
		Employee e2 = getSession(id);
		e2.setName(name);
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.update(e2);
		t.commit();
		session.close();
	}
	public void deleteSession(int id) {
		Employee e = getSession(id);
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.delete(e);
		t.commit();
		session.close();
	}
}
