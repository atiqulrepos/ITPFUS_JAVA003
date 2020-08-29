package org.itpfus.java003.equals;

public class Runner {

	public static void main(String[] args) {
		Person me = new Person("AArosh","Awesome");
		Person you = new Person("AArosh","Awesome");
		
		
		System.out.println(me == you);
		System.out.println(me.equals(you));

		String a = new String("Hello");
		String b = new String("Hello");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
	}

}
