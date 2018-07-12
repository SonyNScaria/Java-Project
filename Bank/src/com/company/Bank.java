package com.company;

public class Bank {
    private long accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getAccountNumber(){
        return this.accountNumber;
    }
    public float getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public long getPhoneNumber(){
        return  this.phoneNumber;
    }
    public void deposit(float amount){
        this.balance +=  amount;
        System.out.println("New balance after deposit"+this.balance);
    }
    public void withdraw(float amount){
        if((this.balance < amount))
            System.out.println("Insufficient balance");
            else{
            this.balance -= amount;
            System.out.println("New balance after withdrawal"+this.balance);
        }

    }
}
