package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Books;

public class DeleteData {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Books.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int bookid = 5;
		Books bo = ss.get(Books.class, bookid);
		
		ss.remove(bo);
		tr.commit();
		ss.close();
		System.out.println("Deleted Successfully");
		
		
	}
}
