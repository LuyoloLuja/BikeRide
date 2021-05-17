package rides;

import models.Rides.BikeRideOne;
import models.models.MountainBike;
import models.models.RoadBike;
import models.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTests {
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
}
