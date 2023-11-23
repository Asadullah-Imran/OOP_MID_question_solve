package q2;

public class Override2 extends Base {
    Override2 (int a,double b){
        super(a, b);
    }
    //code for d

    Override2(Override2 override2){
        super(override2);
    }

    //code for e


    void show() {
        System.out.println("Sum of variables in the Override2 class " + (a+getB()));
    }
}
