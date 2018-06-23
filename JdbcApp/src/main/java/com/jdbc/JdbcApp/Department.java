package com.jdbc.JdbcApp;

public class Department {
	private int Did;
	private String name;
	private String location;
	private int id;
	

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String name, String location, int id) {
		super();
		Did = did;
		this.name = name;
		this.location = location;
		this.id = id;
	}

	public int getDid() {
		return Did;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDid(int did) {
		Did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [Did=" + Did + ", name=" + name + ", location=" + location + ", id=" + id + "]";
	}

}
