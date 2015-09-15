package com.springiocinternals;

public class Dept {

	private Integer dId;
	private String location;
	
	public Dept() {
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Dept(Integer dId, String location) {
		super();
		this.dId = dId;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Dept [dId=" + dId + ", location=" + location + "]";
	}

}
