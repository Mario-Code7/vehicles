package com.pluralsight;

import java.util.List;

public class Moped extends Vehicle {
    private boolean hasKickStand;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, List<Wheel> wheels, boolean hasKickStand) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels);
        this.hasKickStand = hasKickStand;
    }

    public void setHasKickStand(boolean hasKickStand) {
        this.hasKickStand = hasKickStand;
    }

    public boolean hasKickStand() {
        return hasKickStand;
    }
}
