package com.ECIClients;

import java.util.List;
import com.ECIController.Controller;
import com.ECIEntity.Candidate;

public class ECIClients {
	public static void main(String[] args) {
		System.out.println("we are in client");
		Controller con = new Controller();
		List<Candidate> allCandidate = con.getAllCandidate();
		for (Candidate candidate : allCandidate) {
			System.out.println(candidate);
		}

		List<Candidate> insertcand = con.InsertCandidate();
		for (Candidate candidate : insertcand) {
			System.out.println(candidate);
		}

		List<Candidate> update = con.UpdateCandidate();
		for (Candidate candidate : update) {
			System.out.println(candidate);
		}

		List<Candidate> Delete = con.DeleteCandidate();
		for (Candidate candidate : Delete) {
			System.out.println(candidate);
		}

		List<Candidate> onlybjp = con.OnlyBJPCandidate();
		List<Candidate> onlyncp = con.OnlyNCPCandidate();
		List<Candidate> onlyCongress = con.OnlyCongressCandidate();
		List<Candidate> onlyage = con.Onlyageabove55Candidate();
		List<Candidate> onlymale = con.OnlyMaleCandidate();
		List<Candidate> onlyfemale = con.OnlyFemaleCandidate();
	}
}
