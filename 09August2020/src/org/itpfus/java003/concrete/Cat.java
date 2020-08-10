package org.itpfus.java003.concrete;

import org.itpfus.java003.abstracts.Animal;
import org.itpfus.java003.interfaces.Runnable;
import org.itpfus.java003.interfaces.Sleepable;

public class Cat extends Animal implements Runnable {

	@Override
	public void makeNoise(String noise) {
		System.out.println(noise);
	}

	@Override
	public void move() {

	}
	
	@Override
	public void running() {
		
	}

	@Override
	public int sleep(String abc, double xyz) {
		return 1;
	}


}
