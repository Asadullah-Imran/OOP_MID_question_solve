package Q5.b;

public class Rectangle extends Shape {
    double width, height;
    public Rectangle(double width, double
            height)
    {
        this.width = width;
        this.height = height;
    }
    public void printArea(){
        double area = width * height;
        System.out.println("Area: " + area);
    }}
