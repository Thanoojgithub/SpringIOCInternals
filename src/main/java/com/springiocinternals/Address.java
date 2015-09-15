package com.springiocinternals;

public class Address {

	private Integer dNo;
	private String street;
	private String city;
	private Long pincode;

	public Address(Integer dNo, String street, String city, Long pincode) {
		super();
		this.dNo = dNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public Integer getdNo() {
		return dNo;
	}

	public void setdNo(Integer dNo) {
		this.dNo = dNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [dNo=" + dNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode
				+ ", hashCode()=" + hashCode() + "]";
	}

}
