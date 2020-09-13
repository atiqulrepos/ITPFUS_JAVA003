package com.itpfus.java003.enums;

//constants - fixed // variables - vary

enum Level {
	HIGH(100), 
	MEDIUM(50), 
	LOW(0);
	
	int value;
	private Level(int value) {
		this.value = value;
	}
	
	public int getValue( ) {
		return this.value;
	}
}
//AAPL,MSFT,ORCL,GOOGL,AMZN
enum Colonies {
	NY("New York",true),
	DE("Delware",true),
	FL("Florida",false),
	CA("California",false);
	String name;
	boolean isFirstThirteen;
	private Colonies(String name, boolean isFirstThriteen) {
		this.name = name;
		this.isFirstThirteen = isFirstThriteen;
	}
	public String getName() {
		return this.name;
	}
	public boolean isOriginalColony () {
		return this.isFirstThirteen;
	}
}

public class Main {
	public static void main(String[] args) {
		Level level = Level.HIGH;
		int value = Level.HIGH.getValue();
		Colonies cl = Colonies.FL;
		String name = cl.getName();
		boolean isOriginal = cl.isOriginalColony();
		System.out.println(name + " is original: " + isOriginal);
	}
}
