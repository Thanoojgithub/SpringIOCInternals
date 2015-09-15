package com.springiocinternals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PrimaryQualifier {

	/**
	 * primary="true"
	 * 
	 * if more than one bean type configured twice with different names, we can specify -  primary="true", instead of using @Qualifier
	 */
	@Autowired
	private Address addr;
	
	@Qualifier("deptTwo")
	@Autowired
	private Dept dept;
	

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "PrimaryQualifier [addr=" + addr + ", dept=" + dept + ", hashCode()=" + hashCode() + "]";
	}
}
