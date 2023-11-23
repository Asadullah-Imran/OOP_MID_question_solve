package Q5.a;

import Q5.a.Comics;

public class Marvel extends Comics {
    public
    Marvel(){
        this(1000);
    }
    public Marvel(int val){
        System.out.println("Value: " + val);
    }
    public void foo(){
        super.foo();
        System.out.println("Tony Stark" );
    }
    public void foo(double val){
        System.out.println("Steve Rogers");
        System.out.println("Value: " + val);
    }
    public void fubar(){
        bar();
    }}