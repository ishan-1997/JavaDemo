package com.p2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		
		// level 1 Caching --> session caching
		Account a = new Account();
//		a.setAddress(new Address("Sector 30","Noida","India"));
//		a.setTempAddress(new Address("Kohat","Delhi","India"));
//		a.setName("Ravi");
//		a.setBalance(3000);
		List<Policy> policies = new ArrayList<Policy>();
		policies.add(new Policy(1,"A",10));
		policies.add(new Policy(2,"B",20));
		policies.add(new Policy(3,"C",30));
//		a.setPolicies(policies);
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		//session.save(a);
		
		a = (Account)(session.get(Account.class, 1));
		
		a.setBalance(332);
		session.flush();
		a = (Account)(session.get(Account.class, 1));
		System.out.println(" --->> 1 "+a.getBalance());
		
		//t.commit();
		session.evict(a);
		
		System.out.println(" After Evict 2");

		a.setBalance(3203);
		session.merge(a);
		a.setBalance(3201);
		session.merge(a);
		session.flush();
		//policies = a.getPolicies();
		//policies.add(new Policy(4,"D",40));
		t.commit();
		session.close();
//		session = factory.openSession();
//		System.out.println(session.get(Account.class, 3));
//		session.close();
	}
}
