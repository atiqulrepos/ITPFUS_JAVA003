package org.itpfus.java003.exercises;

import java.util.Scanner;

//q: Write a Java program that takes two numbers as input and display the product of two numbers
public class Ex5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int exit = 0;
		while (exit != -1 ) {
			System.out.print("Enter first number: ");
			int i = scn.nextInt();

			System.out.print("Enter second number: ");
			int j = scn.nextInt();
			
			int k = i + j;
			System.out.println(i + " + " + j + " = " + k);
			System.out.println("Enter -1 to exit or other nubmer to continue!");
			exit = scn.nextInt();
		}
		
		System.out.println("Thank you for playing the game!");
		scn.close();
	}

}
