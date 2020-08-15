package org.itpfus.java003.main;

import org.itpfus.java003.animal.Animal;
import org.itpfus.java003.animal.Fish;
import org.itpfus.java003.pets.*;
import org.itpfus.java003.sweetwaterfish.*;

public class Main {

	public static void main(String[] args) {
		Dog mydog = new Dog();
		mydog.eat();
		mydog.move();
		Animal yourdog = new Dog();

		//Parent boy = new Child();
		Animal mycat = new Cat(); //Is A relationship 
		
		//Assign a cat object to mycat variable
		mycat.eat();
		mycat.move();
		//Fish myfish = new Cat();
		Object cimba;
		cimba = new Cat();
		cimba = new Bass();
		
		
		Bass b = (Bass) cimba;
		b.swim();
		
		((Bass) cimba).swim();
		
		Fish f = new Bass();
		//Array
		//Cat t = new Bass();
		//cimba.burr();
		//cimba.eat();
		
		//Object obj = new Object();
		String[] cities = {"New York City", "Los Angeles", "Chicago", "Houston"};
		Object[] myobjects = {f,mycat,mydog};
		
		Object myfish = new Bass();
		
		
		Object obj = new Cat();
		Animal anm = (Animal) obj;
		anm.eat();
		anm.move();

		Cat c = (Cat) anm;
		c.burr();

		
	}

}
