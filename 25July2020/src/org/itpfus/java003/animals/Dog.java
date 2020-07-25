package org.itpfus.j003.animals;

public class Dog
{
    String breed;
    double weight;
    String color;
    double age;
    
    public void dance() {
        double distance = 1.5;
        System.out.println("Dancing!!!");
    }
    
    public void run() {
        System.out.println("Running");
    }
    
    public void bark() {
        System.out.println("Ralf! Ralf");
        sleep();
    }
    
    private void sleep() {
        System.out.println("Zzzz....");
    }
    
    public static final String COUNTRY = "USA";
}
