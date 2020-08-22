package org.iptfus.java003.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class MyTreeMap {

	public static void main(String[] args) {
		Map<String, String> stockSymbols = new HashMap<>();
		stockSymbols.put("MSFT", "Microsoft Corporation");
		stockSymbols.put("APPL", "Apple, the Fruit Company");
		stockSymbols.put("ORCL", "Oracle Corporation");
		ArrayList<String> blueChips = new ArrayList<>();
		blueChips.add("FB");
		blueChips.add("GOOG");
		
		Map<Integer,Person> persons = new TreeMap<>();
		Person p = new Person("David");
		persons.put(2, p);
		persons.put(1, new Person("John"));
		
		Map<String, String> states = new TreeMap<>();
		states.put("NY", "New York");
		states.put("NJ","New Jersey");
		states.put("CT", "Connecticut");
		states.put("TX", "Texas");
		states.put("AK", "Alaska");
		System.out.println(states);		
		
		System.out.println(states.size());
		states.remove("CT");
		
		System.out.println("is my map collect empty?" + states.isEmpty());
		
		for(String state : states.keySet()) {
			System.out.println("Key: " + state + " value: " + states.get(state));
		}
		
		for(String str: states.values()) {
			System.out.println(str);
		}
		
		states.clear();
		System.out.println("is my map collect empty?" + states.isEmpty());
		System.out.println(states);
	}

}
