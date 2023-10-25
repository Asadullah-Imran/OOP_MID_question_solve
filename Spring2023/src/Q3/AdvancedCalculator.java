package Q3;

public class AdvancedCalculator extends Calculator {
    int [] numbers;
    public AdvancedCalculator(int a,int b, int []numbers){
        super(a,b);
        this.numbers=numbers;
    }
    public int sum(){
        int sum=super.sum();
        for(int i=0;i< numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }
}
