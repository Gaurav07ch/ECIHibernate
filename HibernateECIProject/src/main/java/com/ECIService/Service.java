package com.ECIService;

import java.util.List;
import com.ECIDao.Dao;
import com.ECIEntity.Candidate;

public class Service {

	

	public List<Candidate> getAllcandidate() {
		System.out.println("we are in service");
		Dao dao = new Dao();
		List<Candidate> allCandidate = dao.getallCandidate();
		return allCandidate;

	}

	public List<Candidate> insert() {
		Dao dao = new Dao();
		List<Candidate> insert = dao.InsertCandidate();
		return insert;
	}

	public List<Candidate> update() {
		Dao dao = new Dao();
		List<Candidate> update = dao.UpdateCandidate();
		return update;
	}

	public List<Candidate> delete() {
		Dao dao = new Dao();
		List<Candidate> delete = dao.DeleteCandidate();
		return delete;
	}

	public List<Candidate> OnlyBJPCandidate() {
		Dao dao = new Dao();
		List<Candidate> onlybjp = dao.onlybjpcandidate();
		return onlybjp;
	}

	public List<Candidate> OnlyNCPCandidate() {
		Dao dao = new Dao();
		List<Candidate> onlyncp = dao.onlyncpcandidate();
		return onlyncp;
		
	}

	public List<Candidate> OnlycongressCandidate() {
		Dao dao = new Dao();
		List<Candidate> onlycon = dao.onlycongresscandidate();
		return onlycon;
	}

	public List<Candidate> Onlyageabove55Candidate() {
		Dao dao = new Dao();
		List<Candidate> onlyage = dao.onlyabove55candidate();
		return onlyage;
	}

	public List<Candidate> OnlymaleCandidate() {
		Dao dao = new Dao();
		List<Candidate> onlymale = dao.onlymalecandidate();
		return onlymale;
	}

	public List<Candidate> OnlyfemaleCandidate() {
		Dao dao = new Dao();
		List<Candidate> onlyfemale = dao.onlyfemalecandidate();
		return onlyfemale;
	}

}
