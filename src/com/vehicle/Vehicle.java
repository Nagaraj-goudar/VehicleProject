package com.vehicle;

public abstract class Vehicle {

    String companyName;
    int speed;
    String engineNumber;
    int fuelCapacity;

    Vehicle(String brand, int speed, String engineNumber, int fuelCapacity) {
        this.companyName = brand;
        this.speed = speed;
        this.engineNumber = engineNumber;
        this.fuelCapacity = fuelCapacity;
    }

    void start() {
        System.out.println(companyName + " Started");
    }

    void stop() {
        System.out.println(companyName + " Stopped");
    }

    abstract void drive();
}