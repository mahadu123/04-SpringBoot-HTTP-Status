package com.in.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eid;
	private String enmae;
	private String addr;
	private int yearOfJoining;
	private double experience;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", enmae=" + enmae + ", addr=" + addr + ", yearOfJoining=" + yearOfJoining
				+ ", experience=" + experience + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEnmae() {
		return enmae;
	}
	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
}
