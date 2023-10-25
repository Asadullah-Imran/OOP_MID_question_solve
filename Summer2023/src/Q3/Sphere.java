package Q3;

public class Sphere extends Myobject{
    Sphere(double r){
        super(r);
    }
    @Override
    public double findVolume() {
        return  (4*Math.PI *getR()*getR()*getR())/3;
    }
}
