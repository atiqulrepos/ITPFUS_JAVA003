package org.iptfus.java003.collections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<String,String> states = new HashMap<String,String>();
		states.put("NY", "New York");
		states.put("NJ","New Jersey");
		states.put("TX", "Texas");
		
		System.out.println(states.get("TX"));
		
		System.out.println(states);
		states.remove("TX");
		System.out.println(states);
		
		Map<Integer,String> color = new HashMap<>();
		color.put(1, "Red");
		color.put(12, "Amber");
		color.put(3, "Green");
		System.out.println(color);
		color.put(3, "Yellow");
		System.out.println(color);
		
		for(int i : color.keySet()) {
			System.out.println("Key: " + i + " value: " + color.get(i));
		}
		
		for(String str: color.values()) {
			System.out.println(str);
		}
	}
}
