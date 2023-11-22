package q5.b;

public class Functions {
    void swapPoints1(Point a, Point b){
        Point t = a;
        a=b;
        b=t;
    }
    void swapPoints2(Point a, Point b){
        int x = a.x;
        int y= a.y;
        a.x=b.x;
        a.y=b.y;
        b.x=x;
        b.y=y;
    }

}
