package specifications;

import models.Bicycle;
import models.BicycleType;
import models.BikeRide;
import models.Rides.BikeRideOne;
import models.specifications.BicycleFromSpec;
import models.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneSpecTests {
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
}
