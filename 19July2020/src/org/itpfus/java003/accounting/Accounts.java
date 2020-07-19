package org.itpfus.java003.accounting;

public class Accounts
{
    
    public static final double PI = 3.14;
    
    private String accountNumber;
    private String accountHolder;
    private String ssn;
    private double balace;
    private String type;
    public String city;
    public static String state;
    
    public static double add(double i, double j) {
        return i + j;
    }
    
    public Accounts() {
        
        System.out.println("Calling empty constructor");
    } 

    public Accounts(String accountNumber, String accountHolder, String ssn) {
        this();
        System.out.println("Calling 3 param constructor");
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.ssn = ssn;
    }

    public Accounts(String accountNumber, String accountHolder, double balance) {
        this();
        System.out.println("Calling 3 param constructor accepts double");
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balace = balance;
    }

    public Accounts(String accountNumber, String accountHolder, String ssn, String type, double balace) {
        this(accountNumber,accountHolder,ssn);
        System.out.println("Calling 5 param constructor");
        this.balace = balace;
        this.type = type;
    }
    
    public void setBalance() {}
    public void setType() {}

}
