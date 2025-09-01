package cabinvoice;

public class Ride {
    public enum RideType { NORMAL, PREMIUM }

    public double distance;
    public int time;
    public RideType rideType;

    public Ride(double distance, int time, RideType rideType) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }
}
