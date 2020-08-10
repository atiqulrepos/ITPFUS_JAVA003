package org.itpfus.java003.concrete;

import org.itpfus.java003.abstracts.Animal;

public class Dog extends Animal {

	@Override
	public void makeNoise(String bark) {
		System.out.println(bark);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
	}

}
