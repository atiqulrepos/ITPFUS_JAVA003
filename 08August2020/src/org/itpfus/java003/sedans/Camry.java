package org.itpfus.java003.sedans;

import org.itpfus.java003.vehicle.Vehicle;

public class Camry extends Vehicle {

	@Override
	public void setEngine(double engine) {
		if (engine < 20.00 || engine > 25.00) {
			System.out.println("Camry cannot take more than 25 cc Engine");
		} else {
			super.setEngine(engine);
		}
	}
}
