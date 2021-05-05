package bicycles.models;

import bicycles.Bicycle;

public class MountainBike implements Bicycle {
    int speed;

    public void accelerate(){ speed += 4; }
    public void brake(){ speed -= 3; }
    public int currentSpeed(){ return speed; }
    public void stop(){ speed = 0; }

}
