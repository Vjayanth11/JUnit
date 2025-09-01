package cabinvoice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvoiceGeneratorTest {

	@Test
	public void givenNormalRide_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Ride ride = new Ride(2.0, 5, Ride.RideType.NORMAL);
		double fare = invoiceGenerator.calculateFare(ride);
		assertEquals(25.0, fare, 0.0);
	}

	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Ride[] rides = { new Ride(2.0, 5, Ride.RideType.NORMAL), new Ride(0.1, 1, Ride.RideType.NORMAL),
//            new Ride(2.5,10, Ride.RideType.PREMIUM)
		};
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expected = new InvoiceSummary(2, 30.0);
		assertEquals(expected, summary);
	}

	@Test
	public void givenMultiplePremiumRides_ShouldReturnInvoiceSummary() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Ride[] rides = { new Ride(2.0, 5, Ride.RideType.PREMIUM), 
				new Ride(3.0, 10, Ride.RideType.PREMIUM) 
		};
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expected = new InvoiceSummary(2, 105.0);
		assertEquals(expected, summary);
	}

	@Test
	public void givenPremiumRide_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Ride ride = new Ride(2.0, 5, Ride.RideType.PREMIUM);
		double fare = invoiceGenerator.calculateFare(ride);
		assertEquals(40.0, fare, 0.0);
	}
}
