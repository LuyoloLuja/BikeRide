package models.specifications;

import models.BicycleType;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;
    public BicycleType bicycleType;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType){
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }

    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public int getBreakSpeed() {
        return brakeSpeed;
    }

    public BicycleType getBicycleType() {
        return bicycleType;
    }
}
