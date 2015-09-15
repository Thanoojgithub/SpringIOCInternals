package com.springiocinternals;

public class Employee extends Person {

	private Integer eId;

	public Employee(String name, Integer sSNo, Address addr, Integer eId, Dept dept) {
		super(name, sSNo, addr);
		this.eId = eId;
		this.dept = dept;
	}

	private Dept dept;

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [geteId()=" + geteId() + ", getDept()=" + getDept() + ", getName()=" + getName()
				+ ", getsSNo()=" + getsSNo() + ", getAddr()=" + getAddr() + "]";
	}

}
