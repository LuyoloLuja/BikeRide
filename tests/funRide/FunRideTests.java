package funRide;

import models.specifications.BicycleFromSpec;
import models.specifications.BicycleSpecification;
import models.BicycleType;
import models.funRide.FunRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTests {
    @Test
    public void shouldAcceptFiveRoadBikes() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification roadBikeSpecification = new BicycleSpecification(11, -5, BicycleType.RoadBike);

        BicycleFromSpec roadBikeOne = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec roadBikeTwo = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec roadBikeThree = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec roadBikeFour = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec roadBikeFive = new BicycleFromSpec(roadBikeSpecification);

        funRide.accept(roadBikeOne);
        funRide.accept(roadBikeTwo);
        funRide.accept(roadBikeThree);
        funRide.accept(roadBikeFour);
        funRide.accept(roadBikeFive);


        assertEquals(5, funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test
    public void shouldAcceptFiveMountainBikes() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification roadBikeSpecification = new BicycleSpecification(5, -3, BicycleType.MountainBike);

        BicycleFromSpec mountainBikeOne = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec mountainBikeTwo = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec mountainBikeThree = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec mountainBikeFour = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec mountainBikeFive = new BicycleFromSpec(roadBikeSpecification);

        funRide.accept(mountainBikeOne);
        funRide.accept(mountainBikeTwo);
        funRide.accept(mountainBikeThree);
        funRide.accept(mountainBikeFour);
        funRide.accept(mountainBikeFive);

        assertEquals(5, funRide.getCountForType(BicycleType.MountainBike));
    }

    @Test
    public void shouldAcceptFiveTandems() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification roadBikeSpecification = new BicycleSpecification(12, -7, BicycleType.Tandem);

        BicycleFromSpec tandemOne = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec tandemTwo = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec tandemThree = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec tandemFour = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec tandemFive = new BicycleFromSpec(roadBikeSpecification);

        funRide.accept(tandemOne);
        funRide.accept(tandemTwo);
        funRide.accept(tandemThree);
        funRide.accept(tandemFour);
        funRide.accept(tandemFive);

        assertEquals(5, funRide.getCountForType(BicycleType.Tandem));
    }
    @Test
    public void shouldAcceptAllDifferentTypesOfModels(){
        FunRide funRide = new FunRide(3);

        BicycleSpecification roadBikeSpecification = new BicycleSpecification(11, -5, BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpecification = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandemSpecification = new BicycleSpecification(12, -7, BicycleType.Tandem);

        BicycleFromSpec roadBikeRide = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec mountainBikeRide = new BicycleFromSpec(mountainBikeSpecification);
        BicycleFromSpec tandemRide = new BicycleFromSpec(tandemSpecification);

        funRide.accept(roadBikeRide);
        funRide.accept(mountainBikeRide);
        funRide.accept(tandemRide);

        assertEquals(3, funRide.getEnteredCount());
    }

    @Test
    public void shouldNotAddBikesMoreThanMaximumAmount(){
        FunRide funRide = new FunRide(3);

        BicycleSpecification roadBikeSpecification = new BicycleSpecification(11, -5, BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpecification = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandemSpecification = new BicycleSpecification(12, -7, BicycleType.Tandem);

        BicycleFromSpec roadBikeRide = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec mountainBikeRide = new BicycleFromSpec(mountainBikeSpecification);
        BicycleFromSpec roadBikeRideTwo = new BicycleFromSpec(roadBikeSpecification);
        BicycleFromSpec tandemRide = new BicycleFromSpec(tandemSpecification);
        BicycleFromSpec mountainBikeRideTwo = new BicycleFromSpec(mountainBikeSpecification);

        funRide.accept(roadBikeRide);
        funRide.accept(mountainBikeRide);
        funRide.accept(tandemRide);
        funRide.accept(roadBikeRideTwo);
        funRide.accept(mountainBikeRideTwo);

        assertEquals(3, funRide.getEnteredCount());
    }
}
