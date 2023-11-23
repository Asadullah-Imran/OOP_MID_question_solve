package Q2;

public class Homemade extends Food{
    double protein;
    Homemade(double calories,double fat,double carb,double protein){
        super(calories,fat,carb);
        this.protein=protein;
    }
    void HomemadeReview(){
        System.out.println("Inside the review method of Homemade class.");
    }


    void description() {
        System.out.println("in the Homemade class");
    }
}
