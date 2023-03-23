package com.progra.vehicle;


public class Car extends VehicleWithEngine{
    public String model;

    public Car() {
        this.model = "Mazda";
        System.out.println("Car");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
