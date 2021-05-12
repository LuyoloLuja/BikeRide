package bicycles.models;

import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {
    public void accelerate(){ changeSpeed(5); }
    public void brake(){ changeSpeed(-3); }

//    public static  void main(String[] args){
//        MountainBike mountainBike = new MountainBike();
//        mountainBike.accelerate();
//        System.out.println(mountainBike.currentSpeed());
//    }
}
