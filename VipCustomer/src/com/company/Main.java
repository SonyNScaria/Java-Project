package com.company;

public class Main {

    public static void main(String[] args) {
	    VipCustomer obj = new VipCustomer();
        System.out.println("Name"+obj.getName()+"Credit Limit"+obj.getCreditLimit()+"Email Address"+obj.getEmailAddress());
        VipCustomer obj1 = new VipCustomer("Neethu",10);
        System.out.println("Name"+obj1.getName()+"Credit Limit"+obj1.getCreditLimit()+"Email Address"+obj1.getEmailAddress());
        VipCustomer obj2 = new VipCustomer("Neema",7,"bla@mccg.net");
        System.out.println("Name"+obj2.getName()+"Credit Limit"+obj2.getCreditLimit()+"Email Address"+obj2.getEmailAddress());

    }
}
