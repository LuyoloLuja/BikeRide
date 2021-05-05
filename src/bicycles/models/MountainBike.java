package bicycles.models;

public class MountainBike {
    int speed;

    public int accelerate(){ return speed += 4; }
    public int brake(){ return speed -= 3; }
    public int currentSpeed(){ return speed; }
    public int stop(){ return speed = 0; }

}
