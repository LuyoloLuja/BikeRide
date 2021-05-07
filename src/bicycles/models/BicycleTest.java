package bicycles.models;

import bicycles.Bicycle;
import bicycles.Rides.BikeRideOne;
import bicycles.Rides.BikeRideTwo;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ModuleUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
//    Bike Ride Tests
    @Test
    public void roadBikeShouldAccelerate() {
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        assertEquals(11, roadBike.currentSpeed());
    }
    @Test
    public void roadBikeShouldAccelerateAndBreakCorrectly() {
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.brake();
        assertEquals(7, roadBike.currentSpeed());
    }
    @Test
    public void roadBikeShouldDoMultipleAcceleratesCorrectly(){
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        assertEquals(55, roadBike.currentSpeed());
    }
    @Test
    public void roadBikeShouldDoMultipleAccelerateAndBrakesCorrectly() {
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.brake();
        roadBike.accelerate();
        roadBike.brake();
        assertEquals(14, roadBike.currentSpeed());
    }
    @Test
    public void roadBikeShouldBeAbleToStop(){
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.brake();
        roadBike.accelerate();
        roadBike.stop();
        assertEquals(0, roadBike.currentSpeed());
    }

//    Mountain Bike Tests ----------------------
    @Test
    public void mountainBikeShouldAccelerate() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        assertEquals(5, mountainBike.currentSpeed());
    }
    @Test
    public void mountainBikeShouldAccelerateAndBreakCorrectly() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.brake();
        assertEquals(2, mountainBike.currentSpeed());
    }
    @Test
    public void mountainBikeShouldDoMultipleAcceleratesCorrectly(){
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        assertEquals(25, mountainBike.currentSpeed());
    }
    @Test
    public void mountainBikeShouldDoMultipleAccelerateAndBrakesCorrectly() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.accelerate();
        mountainBike.brake();
        assertEquals(4, mountainBike.currentSpeed());
    }
    @Test
    public void mountainBikeShouldBeAbleToStop(){
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.accelerate();
        mountainBike.stop();
        assertEquals(0, mountainBike.currentSpeed());
    }

//  Tandem Bike Tests -------------
    @Test
    public void tandemShouldAccelerate() {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        assertEquals(12, tandem.currentSpeed());
    }
    @Test
    public void tandemShouldAccelerateAndBreakCorrectly() {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.brake();
        assertEquals(5, tandem.currentSpeed());
    }
    @Test
    public void tandemShouldDoMultipleAcceleratesCorrectly(){
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();
        assertEquals(60, tandem.currentSpeed());
    }
    @Test
    public void tandemShouldDoMultipleAccelerateAndBrakesCorrectly() {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.brake();
        tandem.accelerate();
        tandem.brake();
        assertEquals(10, tandem.currentSpeed());
    }
    @Test
    public void tandemShouldBeAbleToStop(){
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.brake();
        tandem.accelerate();
        tandem.stop();
        assertEquals(0, tandem.currentSpeed());
    }

//    Bike Ride One Tests ---------------
    @Test
    public void bikeRideOneShouldBeMountainBike(){
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);

        bikeRideOne.ride(mountainBike);
        assertEquals(12, bikeRideOne.getCurrentSpeed());
    }
    @Test
    public void bikeRideOneShouldBeRoadBike(){
        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRideOne = new BikeRideOne(roadBike);

        bikeRideOne.ride(roadBike);
        assertEquals(29, bikeRideOne.getCurrentSpeed());
    }
    @Test
    public void bikeRideOneShouldBeTandemBike(){
        Tandem tandem = new Tandem();
        BikeRideOne bikeRideOne = new BikeRideOne(tandem);

        bikeRideOne.ride(tandem);
        assertEquals(29, bikeRideOne.getCurrentSpeed());
    }

//    Bike Ride Two Tests ------------------
    @Test
    public void bikeRideTwoShouldBeMountainBike(){
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(mountainBike);

        bikeRideTwo.ride(mountainBike);
        assertEquals(27, bikeRideTwo.getCurrentSpeed());
    }
    @Test
    public void bikeRideTwoShouldBeRoadBike(){
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(roadBike);

        bikeRideTwo.ride(roadBike);
        assertEquals(62, bikeRideTwo.getCurrentSpeed());
    }
    @Test
    public void bikeRideTwoShouldBeTandem(){
        Tandem tandem = new Tandem();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(tandem);

        bikeRideTwo.ride(tandem);
        assertEquals(65, bikeRideTwo.getCurrentSpeed());
    }
}
