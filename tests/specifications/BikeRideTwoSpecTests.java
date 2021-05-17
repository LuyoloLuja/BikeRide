package specifications;

import models.Bicycle;
import models.BicycleType;
import models.BikeRide;
import models.rides.BikeRideTwo;
import models.specifications.BicycleFromSpec;
import models.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoSpecTests {
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
}
