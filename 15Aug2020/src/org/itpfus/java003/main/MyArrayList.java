package org.itpfus.java003.main;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		numbers[0] = 0;
		
		System.out.println("The length of numbers array is: " + numbers.length);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		ArrayList cities = new ArrayList(); 
		cities.add("New York");
		cities.add("Los Angeles");
		cities.add("Chicago");
		System.out.println("The length of cities arraylist is: " + cities.size());
		System.out.println(cities.get(0));
		System.out.println(cities.get(1));
		
		cities.remove(0);
		System.out.println("The length of cities arraylist is: " + cities.size());
		System.out.println(cities.get(0));
		System.out.println(cities.get(1));
		
		
		

	}

}
