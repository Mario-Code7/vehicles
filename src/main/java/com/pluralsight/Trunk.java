package com.pluralsight;

public class Trunk {
    boolean hasSpareTire;
    boolean hasBoomSystem;

    public Trunk(boolean hasSpareTire, boolean hasBoomSystem) {
        this.hasSpareTire = hasSpareTire;
        this.hasBoomSystem = hasBoomSystem;
    }

    public boolean isHasSpareTire() {
        return hasSpareTire;
    }

    public void setHasSpareTire(boolean hasSpareTire) {
        this.hasSpareTire = hasSpareTire;
    }

    public boolean isHasBoomSystem() {
        return hasBoomSystem;
    }

    public void setHasBoomSystem(boolean hasBoomSystem) {
        this.hasBoomSystem = hasBoomSystem;
    }
}
