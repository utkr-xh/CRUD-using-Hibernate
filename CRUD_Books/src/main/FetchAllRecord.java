package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import entity.Books;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllRecord {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();	
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Books.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		CriteriaQuery<Object> cq =  hcb.createQuery();
		Root<Books> root = cq.from(Books.class);
		cq.select(root);
		
		Query query = ss.createQuery(cq); 
		List<Books>  list = query.getResultList();
		
		for (Books books : list) {
			System.out.println(books);
		}
	}
}
