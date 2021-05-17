package models.Rides;

import models.Bicycle;
import models.BikeRide;

public class BikeRideTwo implements BikeRide {
    public Bicycle bicycle;
//    public BicycleType bicycleType;

    public BikeRideTwo(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    public void ride(Bicycle bicycle){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
    }

    public int getCurrentSpeed(){ return this.bicycle.currentSpeed(); }

}