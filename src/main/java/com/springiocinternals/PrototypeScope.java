package com.springiocinternals;

public class PrototypeScope {
	
	public PrototypeScope() {
	}
	
	private String pSid;

	public String getpSid() {
		return pSid;
	}

	public void setpSid(String pSid) {
		this.pSid = pSid;
	}

	@Override
	public String toString() {
		return "PrototypeScope [pSid=" + pSid + ", hashCode()=" + hashCode() + "]";
	}
	
}
