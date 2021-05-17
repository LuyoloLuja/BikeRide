package models.models;

import models.BicycleBase;
import models.BicycleType;

public class RoadBike extends BicycleBase {

    public void accelerate() { changeSpeed(11); }
    public void brake() { changeSpeed(-4); }

    public BicycleType getBicycleType() {
        return BicycleType.RoadBike;
    }

}
