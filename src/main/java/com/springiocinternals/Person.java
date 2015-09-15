package com.springiocinternals;

public class Person {

	private String name;
	private Integer sSNo;
	private Address addr;

	public Person(String name, Integer sSNo, Address addr) {
		super();
		this.name = name;
		this.sSNo = sSNo;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getsSNo() {
		return sSNo;
	}

	public void setsSNo(Integer sSNo) {
		this.sSNo = sSNo;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sSNo=" + sSNo + ", addr=" + addr + "]";
	}

}
