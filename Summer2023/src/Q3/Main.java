package Q3;

public class Main {
    public static void main(String[] args) {
        Sphere sphere1= new Sphere(2.5);
        Cylinder cylinder1 = new Cylinder(1.5,6.5);
        Cone cone1 = new Cone(1.9,8.9);
        Sphere sphere2= new Sphere(3.5);
        Cone cone2 = new Cone(2.7,5.7);

        System.out.println(sphere1.findVolume());
        System.out.println(cylinder1.findVolume());
        System.out.println(cone1.findVolume());
        System.out.println(sphere2.findVolume());
        System.out.println(cone2.findVolume());
    }
}
