package specifications;

import models.Bicycle;
import models.BicycleType;
import rides.BikeRide;
import models.rides.BikeRideTwo;
import models.specifications.BicycleFromSpec;
import models.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeSpecTests {
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
