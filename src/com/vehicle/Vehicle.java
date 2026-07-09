package com.vehicle;

public abstract class Vehicle {

    String vehicleBrand;
    int speed;
    String engineNumber;
    int fuelCapacity;

    Vehicle(String vehicleBrand, int speed, String engineNumber, int fuelCapacity) {
        this.vehicleBrand = vehicleBrand;
        this.speed = speed;
        this.engineNumber = engineNumber;
        this.fuelCapacity = fuelCapacity;
    }

    void start() {
        System.out.println(vehicleBrand + " Started");
    }

    void stop() {
        System.out.println(vehicleBrand + " Stopped");
    }

    abstract void drive();
}