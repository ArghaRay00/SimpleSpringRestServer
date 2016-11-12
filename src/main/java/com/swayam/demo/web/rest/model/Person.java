package com.swayam.demo.web.rest.model;

public class Person {
	private int pid;
	private String lastname;
	private String firstname;
	private String address;
	private String city;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", lastname=" + lastname + ", firstname=" + firstname + ", address=" + address
				+ ", city=" + city + "]";
	}

}
