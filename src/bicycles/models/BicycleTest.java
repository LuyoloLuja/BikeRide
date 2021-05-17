package bicycles.models;

import bicycles.*;
import bicycles.Rides.BikeRideOne;
import bicycles.Rides.BikeRideThree;
import bicycles.Rides.BikeRideTwo;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ModuleUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
//    Road Bike Tests
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

//    ------------------------------------------------------------------------------------------------------------------

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

//    Bike Ride Three Tests -------------------
    @Test
    public void bikeRideThreeShouldBeMountainBike(){
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRideThree = new BikeRideThree(mountainBike);

        bikeRideThree.ride(mountainBike);
        assertEquals(72, bikeRideThree.getCurrentSpeed());
    }
    @Test
    public void bikeRideThreeShouldBeRoadBike(){
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);

        bikeRideThree.ride(roadBike);
        assertEquals(161, bikeRideThree.getCurrentSpeed());
    }
    @Test
    public void bikeRideThreeShouldBeTandem() {
        Tandem tandem = new Tandem();
        BikeRideThree bikeRideThree = new BikeRideThree(tandem);

        bikeRideThree.ride(tandem);
        assertEquals(173, bikeRideThree.getCurrentSpeed());
    }
    //    Tests For Bicycle Specifications
//    Bike Ride One
    @Test
    public void bikeRideOneSpecShouldBeRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBikeFromSpec = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideOne = new BikeRideOne(roadBikeFromSpec);

        bikeRideOne.ride(roadBikeFromSpec);
        assertEquals(roadBikeFromSpec.currentSpeed(), 29);
    }
    @Test
    public void bikeRideOneSpecShouldBeMountainBike() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBikeFromSpec = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRideOne = new BikeRideOne(mountainBikeFromSpec);

        bikeRideOne.ride(mountainBikeFromSpec);
        assertEquals(mountainBikeFromSpec.currentSpeed(), 12);
    }
    @Test
    public void bikeRideOneSpecShouldBeTandem() {
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandemFromSpec = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRideOne = new BikeRideOne(tandemFromSpec);

        bikeRideOne.ride(tandemFromSpec);
        assertEquals(tandemFromSpec.currentSpeed(), 29);
    }

    //    Bike Ride Two
    @Test
    public void bikeRideTwoSpecShouldBeRoadBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBikeFromSpec = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRideTwo = new BikeRideTwo(roadBikeFromSpec);

        bikeRideTwo.ride(roadBikeFromSpec);
        assertEquals(roadBikeFromSpec.currentSpeed(), 62);
    }
    @Test
    public void bikeRideTwoSpecShouldBeMountainBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBikeFromSpec = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRideTwo = new BikeRideTwo(mountainBikeFromSpec);

        bikeRideTwo.ride(mountainBikeFromSpec);
        assertEquals(mountainBikeFromSpec.currentSpeed(), 27);
    }
    @Test
    public void bikeRideTwoSpecShouldBeTandem() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, -4, BicycleType.Tandem);
        Bicycle tandemBikeFromSpec = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRideTwo = new BikeRideTwo(tandemBikeFromSpec);

        bikeRideTwo.ride(tandemBikeFromSpec);
        assertEquals(tandemBikeFromSpec.currentSpeed(), 68);
    }

    //    Bike Ride Three
    @Test
    public void bikeRideThreeSpecShouldBeRoadBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBikeFromSpec = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRideThree = new BikeRideTwo(roadBikeFromSpec);

        bikeRideThree.ride(roadBikeFromSpec);
        assertEquals(roadBikeFromSpec.currentSpeed(), 62);
    }
    @Test
    public void bikeRideThreeSpecShouldBeMountainBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBikeFromSpec = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRideThree = new BikeRideTwo(mountainBikeFromSpec);

        bikeRideThree.ride(mountainBikeFromSpec);
        assertEquals(mountainBikeFromSpec.currentSpeed(), 27);
    }
    @Test
    public void bikeRideThreeSpecShouldBeTandem() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, -4, BicycleType.Tandem);
        Bicycle tandemBikeFromSpec = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRideThree = new BikeRideTwo(tandemBikeFromSpec);

        bikeRideThree.ride(tandemBikeFromSpec);
        assertEquals(tandemBikeFromSpec.currentSpeed(), 68);
    }
}
