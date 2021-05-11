package bicycles;

public class BicycleSpecification {
    private int accelerationSpeed;
    int breakSpeed;

    public BicycleSpecification(int accelerationSpeed,int brakeSpeed){
        this.accelerationSpeed = accelerationSpeed;
    }

    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public int getBreakSpeed() {
        return breakSpeed;
    }
}
