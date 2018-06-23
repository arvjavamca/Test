package com.jdbc.JdbcApp;

public class Address1 {
	private int addrressId;
	private String address1;
	private String address2;
	private int id;

	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address1(int addrressId, String address1, String address2, int id) {
		super();
		this.addrressId = addrressId;
		this.address1 = address1;
		this.address2 = address2;
		this.id = id;
	}

	public int getAddrressId() {
		return addrressId;
	}

	public void setAddrressId(int addrressId) {
		this.addrressId = addrressId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Address [addrressId=" + addrressId + ", address1=" + address1 + ", address2=" + address2 + ", id=" + id
				+ "]";
	}

}
