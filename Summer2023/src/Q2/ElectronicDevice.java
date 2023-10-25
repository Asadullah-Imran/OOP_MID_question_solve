package Q2;

public class ElectronicDevice {
    String brand;
    double price;
    public ElectronicDevice(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}
