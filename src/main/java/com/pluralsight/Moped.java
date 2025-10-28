package com.pluralsight;

import java.util.ArrayList;

public class Moped extends Vehicle {
    private boolean hasKickStand;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels, boolean hasKickStand) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, new ArrayList<>());
        this.hasKickStand = hasKickStand;
    }

    public void setHasKickStand() {
        this.hasKickStand = hasKickStand;
    }

    public boolean hasKickStand() {
        return hasKickStand;
    }
}
