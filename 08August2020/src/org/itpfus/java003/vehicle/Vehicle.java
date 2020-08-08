package org.itpfus.java003.vehicle;

public class Vehicle {
	//what? fields/ variables /parameters  vary - 
	private String chesis;
	private int tires;//tyre
	private double engine;
	private double body;
	private int doors;

	public String getChesis() {
		
		return chesis;
	}
	
	public void setChesis(String chesis) {
		this.chesis = chesis;	
	}
	
	public int getTires() {
		return tires;
	}
	public void setTires(int tires) {
		this.tires = tires;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public double getBody() {
		return body;
	}
	public void setBody(double body) {
		this.body = body;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	//what? function? action - verb 
	public void start(){}
	public void stop(){}
	public void drive(){}
	public void direction(){}
	public void backward(){}
	public void forward(){}
	public void setEngine(){}
}

