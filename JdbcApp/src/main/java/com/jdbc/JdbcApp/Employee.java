package com.jdbc.JdbcApp;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private List<Address1> address1;
	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public List<Address1> getAddress1() {
		return address1;
	}

	public void setAddress1(List<Address1> address1) {
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address1=" + address1 + ", dept="
				+ dept + "]";
	}

}
