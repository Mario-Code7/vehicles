package com.pluralsight;

public class Program {
    public static void main(String[] args) {

        Moped moped = new Moped();
        moped.setColor("Blue");
        System.out.println(moped.getColor());

        Car car = new Car();
        car.setColor("Sage");
        car.setFuelCapacity(16);

        System.out.println("This color of the car is: " + car.getColor() + ". The fuel capacity for the car is: " + car.getFuelCapacity() + " gallons.");


        SemiTruck truck = new SemiTruck();
        System.out.println(truck);


        Hovercraft hovercraft = new Hovercraft();
    }
}
