package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

class RoadBike extends BicycleBase {

    public void accelerate() { changeSpeed(11); }
    public void brake() { changeSpeed(-4); }

    public BicycleType getBicycleType() {
        return BicycleType.RoadBike;
    }

}
