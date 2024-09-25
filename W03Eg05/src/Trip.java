import java.util.Scanner;

public class Trip {
    protected String tripId, driverName, vehicelNumber;
    protected double revenue;
    Scanner in = new Scanner(System.in);

    protected String getTripId() {
        return tripId;
    }

    protected void setTripId(String tripId) {
        this.tripId = tripId;
    }

    protected String getDriverName() {
        return driverName;
    }

    protected void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    protected String getVehicelNumber() {
        return vehicelNumber;
    }

    protected void setVehicelNumber(String vehicelNumber) {
        this.vehicelNumber = vehicelNumber;
    }

    protected double getRevenue() {
        return revenue;
    }

    protected void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    protected Trip(String tripId, String driverName, String vehicelNumber, double revenue) {
        this.tripId = tripId;
        this.driverName = driverName;
        this.vehicelNumber = vehicelNumber;
        this.revenue = revenue;
    }

    protected void input() {
        System.out.println("Nhập mã số xe: ");
        this.tripId = in.nextLine();
        System.out.println("Họ tên tài xế: ");
        this.driverName = in.nextLine();
        System.out.println("Số xe: ");
        this.vehicelNumber = in.nextLine();
        System.out.println("Doanh thu: ");
        this.revenue = in.nextDouble();
    }

    public String toString() {
        return "\nMã số chuyến: " + this.tripId + "\nTên tài xế: " + this.driverName + "\nSố xe: " + this.vehicelNumber;
    }
}
