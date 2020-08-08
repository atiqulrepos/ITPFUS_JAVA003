package org.itpfus.java003;

import org.itpfus.java003.sedans.*;

public class Runner {

	public static void main(String[] args) {
		Mini mymini = new Mini();
		mymini.setEngine(8.0);
		System.out.println("The engine size is now: " + mymini.getEngine());
		mymini.setEngine(12.0);
		System.out.println("The engine size is now: " + mymini.getEngine());
		
		Camry mycamry = new Camry();
		mycamry.setEngine(40.0);
		System.out.println("The engine size is now: " + mycamry.getEngine());
		mycamry.setEngine(22.0);
		System.out.println("The engine size is now: " + mycamry.getEngine());

	}

}
