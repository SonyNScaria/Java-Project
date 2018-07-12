package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number of Centimeters : " + calcFeetAndInchesToCentimeters(-1));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ( (feet < 0) || ( inches < 0 ) || ( inches > 12) ){
            return -1;
        }
        else{
            return  (inches + feet * 12) * 2.54 ;
        }

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if ( ( inches < 0 ) || ( inches > 12) ){
            return -1;
        }
        else{
            return  calcFeetAndInchesToCentimeters(inches/12,inches%12);
        }

    }
}
