package org.itpfus.java003.main;

public class Dog extends Animal {
	
	String address;
	String microchip;
	
	public Dog(String name, String breed) {
		super(name, breed);
	}
	
	public Dog(String name, String breed, double weight, double age,String address_parameter,String x) {
		super(name,breed,weight,age);
		this.address = address_parameter;
		this.microchip = x;
	}
	
	public String findAddress() {
		return this.address;
	}
	
	//override
	@Override
	public void showWeight() {
		System.out.println("My name is Bo. I am the most famous dog");
	}
	
	@Override
	public String toString() {
		return "[Name: " + super.getName() + " breed: " + super.getBreed() + ". lives in the city of " + super.CITY +"]";
	}

}
