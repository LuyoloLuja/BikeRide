package bicycles.models;

import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {

    public static  void main(String[] args){
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        System.out.println(mountainBike.currentSpeed());
    }
    public void accelerate(){ changeSpeed(5); }
    public void brake(){ changeSpeed(-3); }

}
