package bicycles;

public class BikeRide {

    public Bicycle bicycle;

    public BikeRide(Bicycle bicycle) { this.bicycle = bicycle; }
    public void currentSpeed() { bicycle.currentSpeed(); }

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

// public static void main(String[] args) {
//     Bicycle bicycle = new Bicycle();
//     BikeRide bikeRide = new BikeRide(bicycle);
//     bikeRide.ride();
//
//     System.out.println(bikeRide.currentSpeed());
// }
}
