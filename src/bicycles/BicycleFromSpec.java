package bicycles;

public class BicycleFromSpec extends BicycleBase {
    public BicycleSpecification bicycleSpecification;

    public void BicycleFromSpec(BicycleSpecification bicycleSpecification){
        this.bicycleSpecification = bicycleSpecification;
    }

    public void accelerate() { changeSpeed(bicycleSpecification.getAccelerationSpeed()); }
    public void brake() { changeSpeed(bicycleSpecification.getBreakSpeed()); }
}
