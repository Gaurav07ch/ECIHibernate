package com.ECIController;

import java.util.List;
import com.ECIEntity.Candidate;
import com.ECIService.Service;

public class Controller {

	public List<Candidate> getAllCandidate() {
		System.out.println("we are in controller");
		Service service = new Service();
		List<Candidate> allCandidatelist = service.getAllcandidate();
		return allCandidatelist;

	}

	public List<Candidate> InsertCandidate() {
		Service service = new Service();
		List<Candidate> insert = service.insert();
		return insert;

	}

	public List<Candidate> UpdateCandidate() {
		Service service = new Service();
		List<Candidate> update = service.update();
		return update;
	}

	public List<Candidate> DeleteCandidate() {
		Service service = new Service();
		List<Candidate> delete = service.delete();
		return delete;
	}

	public List<Candidate> OnlyBJPCandidate() {
		Service service = new Service();
		List<Candidate> Onlybjp = service.OnlyBJPCandidate();
		return Onlybjp;

	}

	public List<Candidate> OnlyNCPCandidate() {
		Service service = new Service();
		List<Candidate> Onlyncp = service.OnlyNCPCandidate();
		return Onlyncp;

	}

	public List<Candidate> OnlyCongressCandidate() {
		Service service = new Service();
		List<Candidate> Onlycon = service.OnlycongressCandidate();
		return Onlycon;

	}

	public List<Candidate> Onlyageabove55Candidate() {
		Service service = new Service();
		List<Candidate> Onlyage = service.Onlyageabove55Candidate();
		return Onlyage;

	}

	public List<Candidate> OnlyMaleCandidate() {
		Service service = new Service();
		List<Candidate> Onlymale = service.OnlymaleCandidate();
		return Onlymale;
	}

	public List<Candidate> OnlyFemaleCandidate() {
		Service service = new Service();
		List<Candidate> Onlyfemale = service.OnlyfemaleCandidate();
		return Onlyfemale;
	}

}
