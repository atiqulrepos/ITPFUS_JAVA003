package org.itpfus.java003.persons;

import org.itpfus.java003.*;
import org.itpfus.java003.abstraction.QuickSort;
import org.itpfus.java003.abstraction.Sortable;

import java.util.Date;

public class Runner {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Person p1 = new Person("David", "Lee", new Date(1990,05,11));
		System.out.println(p1.hashCode());
		Person p2 = new Person("Stieve", "Lee", new Date(1990,05,11));
		System.out.println(p2.hashCode());
		
		
		//mutable/immutable
		
		String name = "David"; //immutable
		name = "Stieve";
		name = name + "s";
		
		StringBuffer sb = new StringBuffer("David");
		sb.append(" Lee");
		
		System.out.println(sb.capacity());
		sb.append(" Lee runs out of the house ");
		System.out.println(sb.capacity());
		sb.append(" and finds his friend already left ");
		System.out.println(sb.capacity());
		
		System.out.println(sb);
		sb.replace(5, 10, "replace");
		System.out.println(sb);
		System.out.println(sb.substring(20, 30));
		
		StringBuilder sbr = new StringBuilder("Daivd");
		sbr.append(" Lee");
		
		Sortable sort;
		
	}

}
