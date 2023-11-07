package Q4.rollbar;

public class StaticContext extends FinalContext{
    final static int value =8; //You can't modify or remove this line of code
    private static double mark =90;

    private static int count=0;

        private static int getCount() {
            return ++count;
        }
        private static double getMark() {
            return mark;
        }
// You can’t modify the following main method.
        public static void main(String... args) {
            count++;
            System.out.println("count= "+getCount());
            System.out.println("value = "+value);
            FinalContext sv = new StaticContext();
            System.out.println("mark= "+((StaticContext)sv).getMark());
            sv.calculate();
        }
    }



//    Expected Outcome:
//    count= 2
//    value = 8
//    mark= 90.0
//    calculate method is called