package com.ECIDao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.ECIEntity.Candidate;

public class Dao {

	public List<Candidate> getallCandidate() {
		System.out.println("we are in dao");
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Candidate.class);
		List<Candidate> list = criteria.list();
		return list;
	}

	public List<Candidate> InsertCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Candidate can = new Candidate(102, "Sameer Meghe", "BJP", "MH", "Hingna", "Male", 55);
		// Candidate can1 = new Candidate(103, "Sameer Kunavar", "BJP", "MH",
		// "Hinganghat", "Male", 58);
		// Candidate can2 = new Candidate(104, "Nana Patole", "Congress", "MH",
		// "Bhandara", "Male", 57);
		session.save(can);
		// session.save(can1);
		// session.save(can2);
		tx.commit();
		session.close();
		return null;
	}

	public List<Candidate> UpdateCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Candidate can = new Candidate(102, "Sagar Meghe", "NCP", "MH", "Hingna", "Male", 45);
		session.update(can);
		tx.commit();
		session.close();
		return null;
	}

	public List<Candidate> DeleteCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Candidate can = new Candidate(102, "Sagar Meghe", "NCP", "MH", "Hingna", "Male", 45);
		session.delete(can);
		tx.commit();
		session.close();
		return null;
	}

	public List<Candidate> onlybjpcandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Candidate.class);
		criteria.add(Restrictions.like("partyname", "BJP"));
		List<Candidate> listofcandidate = criteria.list();
		for (Candidate candidate : listofcandidate) {
			System.out.println(candidate);
		}
		return null;
	}

	public List<Candidate> onlyncpcandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Candidate.class);
		criteria.add(Restrictions.like("partyname", "NCP"));
		List<Candidate> listofcandidate = criteria.list();
		for (Candidate candidate : listofcandidate) {
			System.out.println(candidate);
		}
		return null;
	}

	public List<Candidate> onlycongresscandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Candidate.class);
		criteria.add(Restrictions.like("partyname", "Congress"));
		List<Candidate> listofcandidate = criteria.list();
		for (Candidate candidate : listofcandidate) {
			System.out.println(candidate);
		}
		return null;
	}

	public List<Candidate> onlyabove55candidate() {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Candidate.class);
		criteria.add(Restrictions.gt("age", 55));
		List<Candidate> listofcandidate = criteria.list();
		for (Candidate candidate : listofcandidate) {
			System.out.println(candidate);
		}
		return null;
	}

	public List<Candidate> onlymalecandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Candidate.class);
		criteria.add(Restrictions.like("gender", "male"));
		List<Candidate> listofcandidate = criteria.list();
		for (Candidate candidate : listofcandidate) {
			System.out.println(candidate);
		}
		return null;
	}

	public List<Candidate> onlyfemalecandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Candidate.class);
		criteria.add(Restrictions.like("gender", "Female"));
		List<Candidate> listofcandidate = criteria.list();
		for (Candidate candidate : listofcandidate) {
			System.out.println(candidate);
		}
		return null;
	}

}
