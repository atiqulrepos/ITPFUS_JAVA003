package org.itpfus.java003.equals;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
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
	
	public boolean equals(Person p) {
		if (this.lastName.equals(p.getLastName()) && this.firstName.equals(p.getFirstName())) {
			return true;
		} else {
			return false;
		}
	}

}
