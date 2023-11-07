package arman;

public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();


        //System.out.println( hello.a); [as a is a private int so it can not be accessed]

        System.out.println("b: " + hello.b);
        System.out.println("c: " + hello.c);
        System.out.println("d: " + hello.d);
    }
}
