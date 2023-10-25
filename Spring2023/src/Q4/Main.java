package Q4;

public class Main {
    public static void main(String[] args) {
        Child x = new Child();
        x.printDetails();
        x.printDetails();
        Parent y = new Parent();
        y.printDetails();
        Child.printDetails();
        Parent.printDetails();
        x.printDetails();
    }
}