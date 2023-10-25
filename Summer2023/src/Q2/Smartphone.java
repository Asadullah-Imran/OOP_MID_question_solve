package Q2;

        //**1**
public class Smartphone extends ElectronicDevice {
        //**2**
    String model;
    String operatingSystem;
    private String IMEI;




      //***3***
    Smartphone(String brand,double price,String model,String operatingSystem,String IMEI){
        super(brand,price);
        this.model=model;
        this.operatingSystem=operatingSystem;
        this.IMEI=IMEI;
    }

            //**4**

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Model: " + model);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("IMEI: " + IMEI);
    }

            //**5**
    public String getIMEI(){
        return IMEI;
    }
}

