package org.itpfus.java003.main;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public int compareTo(Person p) {
		if (this.name.equals(p.toString())) {
			return 1;
		}
		return 0;
	} 
}

public class SetCollection {

	public static void main(String[] args) {
		Set<String> cities = new HashSet<>();
		
		cities.add("New York");
		cities.add("Chicago");
		cities.add("Los Angeles");
		cities.add("Albay");
		cities.add("Torono");
		cities.add("Miami");
		
		System.out.println(cities);
		List<String> citiesList = new ArrayList<String>(cities);
		Collections.sort(citiesList);
		
		System.out.println(citiesList);
		
		Set<Integer> mySortedSet = new TreeSet<>();
		
		mySortedSet.add(30);
		mySortedSet.add(20);
		mySortedSet.add(10);
		mySortedSet.add(20);
		mySortedSet.add(40);
		mySortedSet.add(20);
		System.out.println(mySortedSet);
		
//		Set<Person> persons = new TreeSet<>();
//		persons.add(new Person("John"));
//		persons.add(new Person("John"));
//		persons.add(new Person("John"));
//		persons.add(new Person("John"));
//		persons.add(new Person("John"));
//		persons.add(new Person("John"));
//		
//		System.out.println("The size of persons list is: " + persons.size());
		
		
	}

}
