package org.itpfus.java003.main;

public class Animal {
	
	public static final String CITY = "D.C.";
	private String name;
	private String breed;
	private int numbersOfLegs = 4;
	private int numberOfEys = 2;
	private double weight = 10;
	private double age;
	
	public Animal(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public Animal(String name, String breed, double weight, double age) {
		this(name, breed);
		this.weight = weight;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void showWeight() {
		System.out.println("The weight is : " + this.weight);
	}
	
	public void run() {}

}
