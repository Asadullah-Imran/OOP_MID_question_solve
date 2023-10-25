package Q3;

public class Calculator {
    public int a;
    public int b;
    Calculator(){}
    Calculator(int firstNumber, int secondNumber){
        this.a = firstNumber;
        this.b = secondNumber;
    }
    public int sum(){
        return a+b;
    }
    public int subtract(){
        return a-b;
    }
}
