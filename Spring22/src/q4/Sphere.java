package q4;

public class Sphere extends GeometricShape{
    double radius;
    Sphere(double radius){
        this.radius=radius;
    }
    double volume(){
        return (4*PI*(radius*radius*radius)/3);
    }
}
