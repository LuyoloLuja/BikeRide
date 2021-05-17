package models.models;

import models.BicycleBase;
import models.BicycleType;

public class MountainBike extends BicycleBase {
    public void accelerate(){ changeSpeed(5); }
    public void brake(){ changeSpeed(-3); }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.MountainBike;
    }

//    public static  void main(String[] args){
//        MountainBike mountainBike = new MountainBike();
//        mountainBike.accelerate();
//        System.out.println(mountainBike.currentSpeed());
//    }
}
