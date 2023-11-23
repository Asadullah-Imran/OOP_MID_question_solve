package Q5.b;

public class Square extends Shape {
    double side;
    public Square(double side) { // it should not be Rangtangle
        side = side;
        //it should be this.side *** otherwise side value will not change
    }
    public void printArea(){
        double area = side * side;
        System.out.println("Area" + area);
    }
}

