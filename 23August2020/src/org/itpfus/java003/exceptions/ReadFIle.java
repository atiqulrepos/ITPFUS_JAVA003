package org.itpfus.java003.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFIle {

	public static void main(String[] args) {
		FileInputStream fis = null;
		int buffer;

		try {
			fis = new FileInputStream("Lorem2.txt");
			while ((buffer = fis.read()) != -1) {
				System.out.print((char) buffer);
				//System.out.print(k);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("File could not be read");			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				System.out.println("File hand was not created");
			}
			
			System.out.println("Inside finally block. This line will execute regardless of any Exception");
		}


	}

}
