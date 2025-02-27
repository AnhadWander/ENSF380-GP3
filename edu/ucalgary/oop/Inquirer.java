package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;

class Inquirer {
	private String firstName;
	private String lastName;
	private String servicesPhone;
	private String info;

	public Inquirer(String firstName, String lastName, String phone, String info) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.servicesPhone = phone;
		this.info = info;
	}

	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getServicesPhoneNum() { return servicesPhone; }
	public String getInfo() { return info; }
}
