package com.company;

public class Main {

    public static void main(String[] args) {

    byte byteVariable=64;
    short shortVariable=129;
    int intVariable=500;
    long longVariable= 50000L + 10L*(byteVariable+shortVariable+intVariable);
    System.out.println(longVariable);

    }
}
