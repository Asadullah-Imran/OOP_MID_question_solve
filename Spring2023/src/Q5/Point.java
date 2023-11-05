package Q5;

class Point{
    int x, y;
    int f = 10; //remove final
     static Point p = new Point(1, 2);
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}