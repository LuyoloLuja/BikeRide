package bicycles.Rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.BikeRide;

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

    public void getBicycleType(BicycleType bicycleType) {
        this.bicycleType = bicycleType;
    }

    public int getCurrentSpeed(){
        return this.bicycle.currentSpeed();
    }
}
