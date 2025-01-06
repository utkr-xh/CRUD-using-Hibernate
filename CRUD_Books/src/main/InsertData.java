package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Books;

public class InsertData {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Books.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Books bo = new Books();
		
		
		bo.setBookId(5);
		bo.setTitle("ATOMIC HABITS");
		bo.setAuthor("James Clear");
		bo.setYear(2018);
		bo.setCost(220);
		
		ss.persist(bo);
		System.out.println(bo);
		
		tr.commit();
		ss.close();
		
	}
}
