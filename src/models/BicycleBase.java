package models;

public abstract class BicycleBase implements Bicycle {
    private int speed;

    protected void changeSpeed(int bikeSpeed){
        speed += bikeSpeed;
    }
    public int currentSpeed(){
        return speed;
    }
    public void stop(){
        speed = 0;
    }
}
