public class Vehicle {
    private String ownerVehicle;
    private String model;
    private double price;
    private int capacity;

    public Vehicle(String ownerVehicle, String model, double price, int capacity) {
        this.ownerVehicle = ownerVehicle;
        this.model = model;
        this.price = price;
        this.capacity = capacity;
    }

    public String getOwnerVehicle() {
        return ownerVehicle;
    }

    public void setOwnerVehicle(String ownerVehicle) {
        this.ownerVehicle = ownerVehicle;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getTax(){
        if(capacity < 100){
           return price * 0.01;
        } else if (capacity <= 200) {
            return price * 0.03;
        } else {
            return price * 0.05;
        }
    }
}
