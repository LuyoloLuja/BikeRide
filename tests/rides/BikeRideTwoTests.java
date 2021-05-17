package rides;

import models.Rides.BikeRideTwo;
import models.models.MountainBike;
import models.models.RoadBike;
import models.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTests {
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
