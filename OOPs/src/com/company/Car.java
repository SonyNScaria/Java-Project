package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){

        if( (model.toLowerCase()).equals("porche") || (model.toLowerCase()).equals("audi")){
            this.model = "Sony is a champian";
        }
        else {
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }

}
