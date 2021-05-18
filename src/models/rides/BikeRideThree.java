package models.rides;

import models.Bicycle;
import models.BicycleType;
import rides.BikeRide;

public class BikeRideThree implements BikeRide {
    public Bicycle bicycle;
    public BicycleType bicycleType;

    public BikeRideThree(Bicycle bicycle){ this.bicycle = bicycle; }

    public void ride(Bicycle bicycle){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
    }

    public int getCurrentSpeed(){
        return this.bicycle.currentSpeed();
    }
}
