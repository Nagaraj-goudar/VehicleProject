package com.vehicle;

public class Main {
	public static void main(String[] args) {

        Vehicle bike = new Bike("Honda", 100, "ENG101", 12);
        Vehicle car = new Car("Toyota", 180, "ENG102", 45);
        Vehicle truck = new Truck("Tata", 80, "ENG103", 120);

        bike.start();
        bike.drive();
        bike.stop();

        System.out.println();

        car.start();
        car.drive();
        car.stop();

        System.out.println();

        truck.start();
        truck.drive();
        truck.stop();
    }
}
