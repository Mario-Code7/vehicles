package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{
    private Trunk trunk;
    private boolean moddedCar;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, List<Wheel> wheels, Trunk trunk, boolean moddedCar) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels);
        this.moddedCar = moddedCar;
        this.trunk = trunk;
    }

//    public Car(Trunk trunk) {
//        this.trunk = trunk;
//    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public void setModdedCar() {
        this.moddedCar = moddedCar;
    }

    public boolean moddedCar() {
        return moddedCar;
    }
}
