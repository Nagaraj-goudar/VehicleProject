package com.vehicle;

public abstract class Vehicle {

    String brand;
    int speed;
    String engineNumber;
    int fuelCapacity;

    Vehicle(String brand, int speed, String engineNumber, int fuelCapacity) {
        this.brand = brand;
        this.speed = speed;
        this.engineNumber = engineNumber;
        this.fuelCapacity = fuelCapacity;
    }

    void start() {
        System.out.println(brand + " Started");
    }

    void stop() {
        System.out.println(brand + " Stopped");
    }

    abstract void drive();
}