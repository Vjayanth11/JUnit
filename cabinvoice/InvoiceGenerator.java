package cabinvoice;

public class InvoiceGenerator {
    private static final double NORMAL_RATE_PER_KM = 10;
    private static final int NORMAL_RATE_PER_MIN = 1;
    private static final double NORMAL_MIN_FARE = 5;

    private static final double PREMIUM_RATE_PER_KM = 15;
    private static final int PREMIUM_RATE_PER_MIN = 2;
    private static final double PREMIUM_MIN_FARE = 20;

    public double calculateFare(Ride ride) {
        double fare = 0;
        if (ride.rideType == Ride.RideType.NORMAL) {
            fare = ride.distance * NORMAL_RATE_PER_KM + ride.time * NORMAL_RATE_PER_MIN;
            return Math.max(fare, NORMAL_MIN_FARE);
        } else {
            fare = ride.distance * PREMIUM_RATE_PER_KM + ride.time * PREMIUM_RATE_PER_MIN;
            return Math.max(fare, PREMIUM_MIN_FARE);
        }
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}
