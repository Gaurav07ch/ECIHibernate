package com.ECIEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {

	@Id  
	private int cid;
	private String name;
	private String partyname;
	private String state;
	private String assembly;
	private String gender;
	private int age;

	public Candidate() {
		super();
	}

	public Candidate(int cid, String name, String partyname, String state, String assembly, String gender, int age) {
		super();
		this.cid = cid;
		this.name = name;
		this.partyname = partyname;
		this.state = state;
		this.assembly = assembly;
		this.gender = gender;
		this.age = age;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [cid=" + cid + ", name=" + name + ", partyname=" + partyname + ", state=" + state
				+ ", assembly=" + assembly + ", gender=" + gender + ", age=" + age + "]";
	}
}