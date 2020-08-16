package org.itpfus.java003.main;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayWithWrapperClasses {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		
		System.out.println(numbers);
		Collections.sort(numbers);
	
		System.out.println(numbers);
		
		for(int i : numbers) {
			System.out.println(i);
		}

		List<Integer> vectorList = new Vector<>();
		vectorList.add(10);
		vectorList.add(20);
		vectorList.add(30);
		
		List<String> names = new ArrayList<>();
		
		names.add("John");
		names.add("Tony");
		names.add("David");
		names.add("Adam");
		names.add("Jame");

		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);

	
	}
	

}
