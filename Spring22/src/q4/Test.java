package q4;

public class Test {
    public static void main(String[] args) {
        Sphere sphere=new Sphere(3);
        System.out.println(sphere.volume());
        Cylinder cylinder=new Cylinder(3,5);
        System.out.println(cylinder.volume());
    }
}
