package q52;

class Point{
    int x, y;
      int f = 10;
     Point p = new Point(1, 2);
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Check2{
    public static void main(String args[]){
        Point point = new Point(5, 5);
        point.f = 5;
        point.p.x = 10;
        point.p = new Point(1, 5);
    }
}
