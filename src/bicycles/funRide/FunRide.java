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
            System.out.println("Bike ride added!");
            bicycleRides.add(bicycle);
        } else {
            System.out.println("Can't take anymore bikes, ride is full!");
        }
    }

    // get count for type
    public void getCountForType(BicycleType bicycleType){
        if (bicycleType == BicycleType.RoadBike){
            System.out.println("Number of rides for Road Bike: ");
        } else if(bicycleType == BicycleType.MountainBike) {
            System.out.println("Number of rides for Mountain Bike: " + mountainBike++);
        }else if(bicycleType == BicycleType.Tandem){
            System.out.println("Number of rides for Tandem: " + tandem++);;
        }
    }

    // get number of bikes on a ride
    public int getEnteredCount(){
        return bicycleRides.size();
    }

    public static void main(String[] args){
        FunRide funRide = new FunRide(5);
        funRide.accept(new RoadBike());
        funRide.accept(new RoadBike());
        funRide.accept(new RoadBike());
        funRide.accept(new RoadBike());

        funRide.getCountForType(BicycleType.RoadBike);
        System.out.println(funRide.getEnteredCount());
    }
}
