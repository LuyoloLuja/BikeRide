package models.rides;

import models.Bicycle;
import rides.BikeRide;

public class BikeRideOne implements BikeRide {
   public Bicycle bicycle;

   public BikeRideOne(Bicycle bicycle){
       this.bicycle = bicycle;
   }

    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
    }

    public int getCurrentSpeed () {
       return this.bicycle.currentSpeed();
    }
}
