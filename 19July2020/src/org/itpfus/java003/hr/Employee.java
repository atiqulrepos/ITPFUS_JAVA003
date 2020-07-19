package org.itpfus.java003.hr;

public class Employee
{
    String name;
    double age;
    String address;
    String ssn;
    
    
    //Ambiguous
    
    public Employee(String name, double age, String address, String ssn) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.ssn = ssn;
    }
    
    //access modifier - default (no access modifier), private, public and protected
    //followed by return type - void or any other data type
    //public double calculateSalary(double rate, double hours) {
    //    return rate * hours;
    //}

    public void printDetails() {
        System.out.println("Name: " + this.name + ", age: " + this.age + ", address: " + this.address);
    }
    
    public void work() {}
    public void takeVacation() {}
    public void getSick() {}
    public void clockIn() {}
    public void clockOut() {}
    
}
