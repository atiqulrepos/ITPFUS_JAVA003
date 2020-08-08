package org.itpfus.java003.sedans;

import org.itpfus.java003.vehicle.Vehicle;

public class Mini extends Vehicle {
	
	@Override
	public void setEngine(double engine) {
		if (engine <= 10.00 || engine >= 15.00) {
			System.out.println("Mini cannot take more than 15 cc Engine");
		} else {
			super.setEngine(engine);
		}
	}
	
	public void engageTurbo() {
		System.out.println("Turbo engaged!!!!");
	}
}
