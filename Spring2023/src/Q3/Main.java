package Q3;

public class Main {
    public static void main(String[] args) {
        AdvancedCalculator c = new AdvancedCalculator(1, 2, new int[]{3, 4, 5});
        System.out.println(c.subtract());
        System.out.println(c.sum());
    }
}
