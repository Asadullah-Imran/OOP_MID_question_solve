package q2;

public class Base {
    public int a;
    private double b;
    Base (int a,double b){
        this.a=a;
        this.b=b;
    }
    Base(Base ob){
        a=ob.a;
        b=ob.b;
    }
    //Code for a
    public double getB(){
        return b;
    }
    void show(){
        System.out.println("sum of variables"
        +"In the Base class"+a+b);
    }

}
