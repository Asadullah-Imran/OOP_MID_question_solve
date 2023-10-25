package Q2;

public class Main {
    public static void main(String[] args) {
        Smartphone oppo=new Smartphone("Oppo",34000,"A47","OS","54398fjk4897");
        oppo.displayInfo();
        System.out.println("checking IMEI access outside the class ");
        System.out.println(oppo.getIMEI());

    }
}
