package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Wheel> mopedWheels = new ArrayList<>();
        for(int i = 0; i < 1; i++) {
            mopedWheels.add(new Wheel(14, "Winter"));
        }
        Moped moped = new Moped("Yellow", 4, 7, 16, mopedWheels, true);
        System.out.println(moped);
//        Moped moped = new Moped("Red", 4, 5, 16, mopedWheels,  true);
//        System.out.println(moped);
//        moped.setColor("Blue");
//        System.out.println(moped.getColor());

//        Car car = new Car();
//        car.setColor("Sage");
//        car.setFuelCapacity(16);
//
//        System.out.println("This color of the car is: " + car.getColor() + ". The fuel capacity for the car is: " + car.getFuelCapacity() + " gallons.");
//
//
//        SemiTruck truck = new SemiTruck();
//        System.out.println(truck);
//
//
//        Hovercraft hovercraft = new Hovercraft();
    }
}
