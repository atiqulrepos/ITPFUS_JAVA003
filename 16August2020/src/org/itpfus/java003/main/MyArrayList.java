package org.itpfus.java003.main;

import java.util.ArrayList;
import java.util.Iterator;

class Account {
	//int, short, byte, long, double, float, char boolean
	//Wrapper class	
}

class CheckingAccount extends Account {
	
}

public class MyArrayList {

	public static void main(String[] args) {
	
		String s = "Sunday";
		
		int k = 10, j = 20;
		System.out.println(k + j);//30
		
		Integer m = 10, n = 20;
		System.out.println(m+n);//30
		System.out.println(m.toString() + n.toString());
		
		int var = 10;
		Integer var2 = 10; //Wrapper classes
		Integer var3 = new Integer(10);
	
		
		
		int[] numbers = new int[3];
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		//numbers[0] = 0;
		
		System.out.println("The length of numbers array is: " + numbers.length);
		
		//traditional - c language
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("traditional: " + numbers[i]);
		}
		
		//enhanced - java
		for (int element: numbers) {
			System.out.println("enhanced: " + element);
		}
		
		System.out.println(numbers);
		
		ArrayList cities = new ArrayList(); 
		cities.add("New York");
		cities.add("Los Angeles");
		cities.add("Chicago");
		cities.add(12345);
		
		System.out.println("The length of cities arraylist is: " + cities.size());
		System.out.println(cities);
		System.out.println(cities.get(0));
		System.out.println(cities.get(1));
		
		System.out.println("I want to know if city of New York exists in this array: " + cities.contains("New York"));
		System.out.println("Index of Los Angeles:" + cities.indexOf("Los Angeles"));
		
		cities.remove(0);
		
		System.out.println("The length of cities arraylist is: " + cities.size());
		System.out.println(cities.get(0));
		System.out.println(cities.get(1));
		
		System.out.println(cities.isEmpty());
		//cities.clear();
		//System.out.println(cities.isEmpty());
		
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		
		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(new Account());
		accounts.add(new Account());
		//accounts.add(new CheckingAccount());
		

	}

}
