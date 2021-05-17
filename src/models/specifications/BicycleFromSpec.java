package models.specifications;

import models.BicycleBase;
import models.BicycleType;

public class BicycleFromSpec extends BicycleBase {
    public BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification){
        this.bicycleSpecification = bicycleSpecification;
    }

    public void accelerate() { changeSpeed(this.bicycleSpecification.getAccelerationSpeed()); }
    public void brake() { changeSpeed(this.bicycleSpecification.getBreakSpeed()); }
    public int currentSpeed() { return super.currentSpeed(); }


    public BicycleType getBicycleType() {
        return this.bicycleSpecification.getBicycleType();
    }
}
