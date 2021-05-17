package rides;

import models.models.MountainBike;
import models.models.RoadBike;
import models.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThree {
    @Test
    public void bikeRideThreeShouldBeMountainBike(){
        MountainBike mountainBike = new MountainBike();
        models.rides.BikeRideThree bikeRideThree = new models.rides.BikeRideThree(mountainBike);

        bikeRideThree.ride(mountainBike);
        assertEquals(72, bikeRideThree.getCurrentSpeed());
    }
    @Test
    public void bikeRideThreeShouldBeRoadBike(){
        RoadBike roadBike = new RoadBike();
        models.rides.BikeRideThree bikeRideThree = new models.rides.BikeRideThree(roadBike);

        bikeRideThree.ride(roadBike);
        assertEquals(161, bikeRideThree.getCurrentSpeed());
    }
    @Test
    public void bikeRideThreeShouldBeTandem() {
        Tandem tandem = new Tandem();
        models.rides.BikeRideThree bikeRideThree = new models.rides.BikeRideThree(tandem);

        bikeRideThree.ride(tandem);
        assertEquals(173, bikeRideThree.getCurrentSpeed());
    }
}
