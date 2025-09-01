package cabinvoice;

public class InvoiceSummary {
    public int numberOfRides;
    public double totalFare;
    public double averageFare;

    public InvoiceSummary(int numberOfRides, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.numberOfRides;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        InvoiceSummary other = (InvoiceSummary) obj;
        return numberOfRides == other.numberOfRides &&
               Double.compare(totalFare, other.totalFare) == 0 &&
               Double.compare(averageFare, other.averageFare) == 0;
    }
}

