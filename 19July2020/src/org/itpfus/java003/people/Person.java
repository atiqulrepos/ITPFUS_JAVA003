package org.itpfus.java003.people;

import java.util.Date;

public class Person
{
    public String name;
    private double height;
    private String eyeColor;
    private String race;
    private char gender;
    private double weight;
    private Date dob;
    private double baseSalary = 50000;
    
    //public int function_name(int, int)//method signature
    
    public int add(int a, int b) {
        int c = a + b;
        return c;
    }
    public void showName () {}
    
    
    //public void fn(double )
    public void setSalary (double increment) {
        if (increment > 5000) {
            System.out.println("You cannot add more than 5000");
        } else {
            this.baseSalary += increment;
        }
    }
    
    public double getSalary() {
        return this.baseSalary;
    }
        
    public void setHeight(double height) {
        this.height = height;
    }

    public String getEyeColor()
    {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor)
    {
        this.eyeColor = eyeColor;
    }

    public String getRace()
    {
        return race;
    }

    public void setRace(String race)
    {
        this.race = race;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public Date getDob()
    {
        return dob;
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    //verbs
    public double getHeight()
    {
        return height;
    }
    
    /*
    //methods
    eat
    talk
    work
    */
    

}

