package org.itpfus.java003.main;

import org.itpfus.java003.fourlegged.Dog;

public class Runner
{

    public static void main(String[] args)
    {
      //instantiation //creating a new instance of a Dog
        Dog mydog = new Dog(); 
        Dog yourdog = new Dog();
        Dog hisdog = new Dog();
        
        mydog.bark();
        yourdog.jump();
        hisdog.run();

    }

}
