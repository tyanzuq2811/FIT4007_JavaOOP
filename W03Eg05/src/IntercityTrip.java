import java.util.Scanner;

public class IntercityTrip extends Trip {
    private String destination;
    private int numberOfDays;
    Scanner in = new Scanner(System.in);

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public IntercityTrip(String tripId, String driverName, String vehicelNumber, double revenue, String destination, int numberOfDays) {
        super(tripId, driverName, vehicelNumber, revenue);
        this.destination = destination;
        this.numberOfDays = numberOfDays;
    }
}
