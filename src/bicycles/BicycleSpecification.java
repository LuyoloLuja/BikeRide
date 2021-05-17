package bicycles;

public class BicycleSpecification {
    private final int accelerationSpeed;
    private int brakeSpeed;
    BicycleType bicycleType;

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
}
