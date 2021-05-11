package bicycles;

import bicycles.Rides.BikeRideOne;

public class BicycleFromSpec extends BicycleBase {
    BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
    Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);


    BikeRideOne bikeRideOne = new BikeRideOne(bicycle);

    public BikeRideOne getBikeRideOne() {
        return bikeRideOne.ride(bicycle);
    }
}
