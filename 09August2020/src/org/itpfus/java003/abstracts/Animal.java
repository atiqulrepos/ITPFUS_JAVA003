package org.itpfus.java003.abstracts;

public abstract class Animal {

	double age;
	String type;
	String breed;
	double weight;
	
	public abstract void makeNoise(String placeHolder);
	public abstract void move();
	
	public void eat() {
		System.out.println("Eating my food");
	}

}
