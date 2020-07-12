package org.itpfus.java003.fourlegged;

/*
 * Object has proerties
Object has actions

Dog
    properties
        legs
        eyes
        tail
        color
        height
        weight
        breed
        fur
    
    actions
        barks
        bites
        runs
        jumps
        walks
        wag tail
        snifs
        eats
        sleeps
        poops
        
 */

public class Dog
{
    // dog peroprties
    String color; // black, white, gold, other
    double height;
    double weight;
    String breed; // huskey, german shepard
    

    // method or a function
    public void bark()
    {
        System.out.println("Ralf, Ralf!");
    }

    public void run()
    {
        System.out.println("Running");
    }

    public void jump()
    {
        System.out.println("Jumping");
    }

    public void walk()
    {
        System.out.println("walking");
    }
}
