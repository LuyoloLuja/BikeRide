package bicycles.funRide;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
//    array list to  add rides
    List<Bicycle> bicycleRides = new ArrayList<>();
    int maxNumberOfBikes;
    int mountainBike;
    int roadBike;
    int tandem;

//    fun ride constructor
    public FunRide(int maxNumberOfBikes){
        this.maxNumberOfBikes = maxNumberOfBikes;
    }

//    method to accept rides
    public void accept(Bicycle bicycle){
        if(bicycleRides.size() < maxNumberOfBikes && !bicycleRides.contains((bicycle))){

            if(bicycle instanceof MountainBike) {
                mountainBike++;
            } else if(bicycle instanceof RoadBike){
                roadBike++;
            } else if (bicycle instanceof Tandem){
                tandem++;
            }

            bicycleRides.add(bicycle);
        } else {
            System.out.println("Can't take anymore bikes, ride is full!");
        }
    }

    // get count for type
    public void getCountForType(BicycleType bicycleType){
        if (bicycleType == BicycleType.RoadBike){
            // return mountatin typ
        } else {
            //
        }
//        for(int i = 0; i <= bicycleRides.size(); i++) {
//            if(bicycleType.equals(bicycleRides.get(i))){
//
//            }
//        }
    }

    // get number of bikes on a ride
    public int getEnteredCount(){
        return bicycleRides.size();
    }
}
