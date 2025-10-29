package com.pluralsight;

import java.util.List;

public class Hovercraft extends Vehicle {
    private double airPressure;
    private double maxGroundHeight;
    private int rudderCount;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, List<Wheel> wheels) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels);
        this.airPressure = airPressure;
        this.maxGroundHeight = maxGroundHeight;
        this.rudderCount = rudderCount;
    }

    public double getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(double airPressure) {
        this.airPressure = airPressure;
    }

    public double getMaxGroundHeight() {
        return maxGroundHeight;
    }

    public void setMaxGroundHeight(double maxGroundHeight) {
        this.maxGroundHeight = maxGroundHeight;
    }

    public int getRudderCount() {
        return rudderCount;
    }

    public void setRudderCount(int rudderCount) {
        this.rudderCount = rudderCount;
    }
}
