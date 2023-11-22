package q4;

public class Cylinder extends GeometricShape{
    double radius;
    double height;
    Cylinder(double radius, double height){
        this.radius=radius;
        this.height=height;
    }
    double volume(){
        return (PI * (radius*radius)*height);
    }
}
