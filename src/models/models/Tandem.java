package models.models;

import models.BicycleBase;
import models.BicycleType;

public class Tandem extends BicycleBase {
    public void accelerate() { changeSpeed(12); }
    public void brake() { changeSpeed(-7); }

    public BicycleType getBicycleType() {
        return BicycleType.Tandem;
    }
}
