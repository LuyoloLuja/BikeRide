package bicycles.models;

import bicycles.Bicycle;

public class RoadBike implements Bicycle {
    int speed;

    public void accelerate(){ speed += 11; }
    public void brake(){ speed -= 4; }
    public int currentSpeed(){ return speed; }
    public void stop(){ speed = 0; }
}
