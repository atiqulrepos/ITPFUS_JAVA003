package org.itpfus.j003.main;

import org.itpfus.j003.animals.Dog;
import org.itpfus.j003.robots.Robot;

//instantiation or creating an instance of a class or create an object from a class
//variable types - instance or class variables
//private/public
//static - without creating an instance

public class Runner
{

    //access modifier static/non static return type name ( String array var name)
    public static void main(String[] args)
    {
        
        Robot.country = "USA";
        Robot.country = Robot.country.toLowerCase();

        double sqrRtOf25 = Math.sqrt(25);
        
        Robot rob = new Robot(); //instantiation or creating an instance of a class or create an object from a class 
        rob.city = "New York";

        Robot r2d2 = new Robot();
        r2d2.city = "Los Angeles";
        
        Robot.country = "USA";
        
        rob.displayCountry();
        r2d2.displayCountry();
       
        Dog bo = new Dog();
        bo.bark();
        Dog jimmy = new Dog();
        Dog bhombol = new Dog();
        Dog sully = new Dog();
        
    }

}
