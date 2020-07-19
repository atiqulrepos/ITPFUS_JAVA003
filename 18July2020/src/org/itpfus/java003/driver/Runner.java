package org.itpfus.java003.driver;

import org.itpfus.java003.accounting.*;
import org.itpfus.java003.hr.*;
import org.itpfus.java003.people.Person;

import java.math.*;
//import java.lang.System;

public class Runner
{
    public static void main(String[] args)
    {
        BigInteger bg;
        Employee john = new Employee("John",30.0, "123 Main Street, Dover, NJ", "123-45-6789"); // instantiation //create an instance
        //john.printDetails();
        
        Employee david = new Employee("David", 32.0, "34 Happy Street, Queens, NY", "455-23-1345");
        //david.printDetails();

        Employee jane = new Employee("Jane", 31.0, "45 Broadway, Manhattan, NY", "545-53-9835");
        //jane.printDetails();
        
        Person kid = new Person(); 
        kid.name = "Aarosh";
        kid.setHeight(5.2);
        
        //kid.baseSalary = 500000;
        
        Person kid2 = new Person();
        
        
        

    }

}
