package com.pluralsight;

import java.util.List;

public class SemiTruck extends Vehicle {
    private boolean sleeperCabin;
    private int countTrailer;
    private Trunk cabTrailer;
    private Trunk trailerTrunk;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, List<Wheel> wheels, boolean sleeperCabin, int countTrailer, Trunk cabTrailer, Trunk trailerTrunk) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels);
        this.sleeperCabin = sleeperCabin;
        this.countTrailer = countTrailer;
        this.cabTrailer = cabTrailer;
        this.trailerTrunk = trailerTrunk;
    }

    public boolean isSleeperCabin() {
        return sleeperCabin;
    }

    public void setSleeperCabin(boolean sleeperCabin) {
        this.sleeperCabin = sleeperCabin;
    }

    public int getCountTrailer() {
        return countTrailer;
    }

    public void setCountTrailer(int countTrailer) {
        this.countTrailer = countTrailer;
    }

    public Trunk getCabTrailer() {
        return cabTrailer;
    }

    public void setCabTrailer(Trunk cabTrailer) {
        this.cabTrailer = cabTrailer;
    }

    public Trunk getTrailerTrunk() {
        return trailerTrunk;
    }

    public void setTrailerTrunk(Trunk trailerTrunk) {
        this.trailerTrunk = trailerTrunk;
    }
}
