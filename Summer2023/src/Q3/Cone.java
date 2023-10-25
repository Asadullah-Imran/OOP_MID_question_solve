package Q3;

public class Cone extends Cylinder{
    public  Cone(double r, double h){
        super(r,h);
    }

    @Override
    public double findVolume() {
        return super.findVolume()/3;
    }
}
