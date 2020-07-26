package org.itpfus.java003.main;

public class Runner {

	public static void main(String[] args) {
		catStuff();
		Dog bo = new Dog("Bo", "Portuguese Water Dog", 20.0, 3.0, "1600 Pan Ave", "AD834D8CFF");
		bo.showWeight();
		bo.run();

		Dog jimmy = new Dog("Jimmy", "Husky");

		System.out.println(bo.toString());

		// Animal am = new Animal("bo","Husky", 50.0, 10);

	}

	public static void catStuff() {
		Cat c = new Cat("Minee", "Partian");
		c.catchAndKill();
		System.out.println(c.toString());

	}

}
