package com.itpfus.java003.relationship;

import java.util.ArrayList;
import java.util.List;

class Bicycle {
}

class Student{ //has a bicycle //has-a-relationship
	Bicycle bicycle;
	
	public Student(Bicycle cycle) {
		this.bicycle = cycle;
	}
}

class Classroom { //has-a-relationship
	Student student;
}

interface Animal {}

class Cat implements Animal{} //is-a-relationship
class Dog implements Animal{} //is-a-relationship

//earth is a Planet
//Rose is a Flower
//Lily is a Flower

public class Relationships {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Dog());
		animals.add(new Cat());
	}
}
