package bicycles.models;

public class RoadBike {
    int speed;

    public int accelerate(){ return speed += 11; }
    public int brake(){ return speed -= 5; }
    public int currentSpeed(){ return speed; }
    public int stop(){ return speed = 0; }
}
