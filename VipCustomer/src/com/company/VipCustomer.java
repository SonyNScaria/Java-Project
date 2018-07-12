package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Sony",9.00,"mesonyscaria@gmail.com");
        System.out.println("Default Constructor called");
    }
    public VipCustomer(String name, double creditLimit){
        this(name,creditLimit,"secondconstructor@gmail.com");
        System.out.println("Second Constructor called");
    }
    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
