package q2;

public class Override extends Base{
    int c;

    //code for b;
    Override(int a, double b, int c){
        super(a,b);
        this.c = c;
    }

    //code for c
    void show() {
        System.out.println("sum of variables"+"In the Override Class "+(a+getB()+c));
    }
}
