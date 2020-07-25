package org.itpfus.j003.robots;

public class Robot
{
    private String name;
    public String city;
    String state;
    
    public static String country; //class variable
    
    public String getName()
    {
        String restrictedName;
        {
            
        }
        return name;
    }
    public void setName(String name)
    {
        
        this.name = name;
    }
    
    public void displayCountry() {
        System.out.println(this.country);
    }
   
    { //parent block
       String myCar; 
       double temp;
       { //child1 block
          myCar = "Toyota";
          temp = 20;
       }
       
       {//child2 block
         myCar = "Honda";

       }
        
    }
    
    private void calc() {
        this.name = "abcd";
    }
    
    
}
