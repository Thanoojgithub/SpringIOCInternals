package com.springiocinternals;

public class FactoryMethodBean {

	private String fmbName;
	
	private Address addr;

	public FactoryMethodBean() {
	}

	public static FactoryMethodBean getInstanceFmb(String fmbName, Address addr) {
		FactoryMethodBean factoryMethodBean = new FactoryMethodBean();
		factoryMethodBean.setFmbName(fmbName);
		factoryMethodBean.setAddr(addr);
		return factoryMethodBean;
	}

	public String getFmbName() {
		return fmbName;
	}

	public void setFmbName(String fmbName) {
		this.fmbName = fmbName;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "FactoryMethodBean [fmbName=" + fmbName + ", addr=" + addr + ", hashCode()=" + hashCode() + "]";
	}
}
