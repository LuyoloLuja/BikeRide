package models.funRide;

import models.specifications.BicycleFromSpec;
import models.specifications.BicycleSpecification;
import models.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
//    array list to  add rides
    private final List<BicycleFromSpec> bicycleRidesList = new ArrayList<>();
    int maxNumberOfBikes;

//    fun ride constructor
    public FunRide(int maxNumberOfBikes){
        this.maxNumberOfBikes = maxNumberOfBikes;
    }

//    method to accept rides
    public void accept(BicycleFromSpec bicycle){
        if(bicycleRidesList.size() < maxNumberOfBikes && !bicycleRidesList.contains((bicycle))){
            System.out.println("Bike ride added.");
            bicycleRidesList.add(bicycle);
        } else {
            System.out.println("Can't take anymore bikes, ride is full!");
        }
    }

    // get count for type
    public int getCountForType(BicycleType bicycleType){
        int counter = 0;

        for (BicycleFromSpec eachBicycle: bicycleRidesList) {
            if(eachBicycle.getBicycleType().equals(bicycleType)){
                counter++;
            }
        }
        return counter;
    }

    // get number of bikes on a ride
    public int getEnteredCount(){
        return bicycleRidesList.size();
    }

    public static void main(String[] args){
        FunRide funRide = new FunRide(5);
        BicycleSpecification roadBikeSpecification = new BicycleSpecification(11, -5, BicycleType.RoadBike);

        BicycleFromSpec roadBikeRideOne = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec roadBikeRideTwo = new BicycleFromSpec(roadBikeSpecification);

        funRide.accept(roadBikeRideOne);
        funRide.accept(roadBikeRideTwo);

        System.out.println("Number of Road Bikes: " + funRide.getCountForType(BicycleType.RoadBike));
        System.out.println("Number of all Bike Rides: " + funRide.getEnteredCount());
    }
}
