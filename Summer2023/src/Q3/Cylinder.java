package Q3;

public class Cylinder extends Myobject{
    private double h;
    Cylinder(double r, double h){
        super(r);
        this.h=h;
    }


    public double findVolume() {
        return Math.PI * getR()*getR()*h;
    }
}
