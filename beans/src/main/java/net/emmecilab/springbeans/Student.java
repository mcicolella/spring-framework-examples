package net.emmecilab.springbeans;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String firstName;
	private String lastName;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
