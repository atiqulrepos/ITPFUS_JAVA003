package org.itpfus.java003.exceptions;

public class TryCatch {

	public static void main(String[] args) {
		int i = 10, j = 0;

		try {
			int k = i / j;
			System.out.println("The result is: " + k);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		
		try {
			int[] arr = {1,2,3,4};
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("Thank you for your business!");
	}

}
