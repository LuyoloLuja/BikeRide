package models;

public interface Bicycle {
    void accelerate();
    void brake();
    int currentSpeed();
    void stop();
    BicycleType getBicycleType();
}
