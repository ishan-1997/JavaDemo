package com.p4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
	
		//StudentDetails sd= new StudentDetails("a@gmail.com",98);
		//Student s = new Student("a",10);
		StudentDetails sd= null;
		Student s = null;
		//s.setStudentDetails(sd);
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
	
		//session.save(s);
		s = session.get(Student.class, 1);
		sd = session.get(StudentDetails.class, 2);
		
		System.out.println(s.getStudentDetails().toString());
		System.out.println(sd.getStu().toString());
		session.close();
		
	}
}
