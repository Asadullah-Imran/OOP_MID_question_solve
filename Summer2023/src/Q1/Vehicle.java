package Q1;

public class Vehicle {
    private String brand;
    private String model;
    static {
        System.out.println("Initializing Vehicle class...");
    }
    {
        System.out.println("Initializing an instance of the Vehicle class...");
    }
    public Vehicle() {
        System.out.println("Creating a default vehicle.");
                brand = "Unknown";
    }
    public Vehicle(String brand, String model) {
        System.out.println("Creating a customized vehicle of brand: " + brand + " and model: " + model);
        this.brand = brand;
        this.model = model;
    }
    public void honk() {
        System.out.println("The vehicle emits a honking sound.");
    }
    public void honk(String sound) {
        System.out.println("The vehicle emits a custom honking sound: " + sound);
    }
    static{
        System.out.println("Making sure of initialization...");
    }
    public void info(){
        System.out.println("model="+model+" brand="+brand);
    }
    public static void main(String[] args) {

        Vehicle defaultVehicle = new Vehicle();
        // { as the below line are in static block so it will call when the Vehicle class is calling (but it will call once ) }
        //Initializing Vehicle class...
        //Making sure of initialization...


        // {this is will be called whenever the Vehicle function will call as it is in block statement of this class}
        //Initializing an instance of the Vehicle class...



        // {now come to the class default function value }
        //Creating a default vehicle.

        defaultVehicle.honk();
        //The vehicle emits a honking sound.

        defaultVehicle.info();
        //model=null brand=Unknown
        Vehicle truck = new Vehicle("Ford", "F- 150");
        // {this is will be called whenever the Vehicle function will call as it is in block statement of this class}
        //Initializing an instance of the Vehicle class...

        // {now come to the class constructor printing value }
        //Creating a customized vehicle of brand: Ford and model: F- 150

        truck.honk("Loud horn sound");
        //The vehicle emits a custom honking sound: Loud horn sound

        truck.info();
        //model=F- 150 brand=Ford
    }

}


//          ***EXPECTED OUTPUT***

//    Initializing Vehicle class...
//    Making sure of initialization...
//    Initializing an instance of the Vehicle class...
//    Creating a default vehicle.
//    The vehicle emits a honking sound.
//    model=null brand=Unknown
//    Initializing an instance of the Vehicle class...
//    Creating a customized vehicle of brand: Ford and model: F- 150
//    The vehicle emits a custom honking sound: Loud horn sound
//    model=F- 150 brand=Ford
