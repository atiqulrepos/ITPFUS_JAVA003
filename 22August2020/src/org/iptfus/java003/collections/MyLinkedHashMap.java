package org.iptfus.java003.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {

	public static void main(String[] args) {
		Map<String, String> states = new LinkedHashMap<>();
		states.put("NY", "New York");
		states.put("NJ","New Jersey");
		states.put("TX", "Texas");
		System.out.println(states);		
		
		
		for(String state : states.keySet()) {
			System.out.println("Key: " + state + " value: " + states.get(state));
		}
		
		for(String str: states.values()) {
			System.out.println(str);
		}

	}

}
