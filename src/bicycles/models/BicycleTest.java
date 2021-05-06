package bicycles.models;

import bicycles.Bicycle;
import bicycles.Rides.BikeRideOne;
import org.junit.jupiter.api.Test;

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

//    Bike Ride One Tests
    @Test
    public void bikeRideOneShouldAccelerate(){
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);

        bikeRideOne.ride(mountainBike);
        assertEquals(bikeRideOne.getCurrentSpeed(), 12);
    }
}
