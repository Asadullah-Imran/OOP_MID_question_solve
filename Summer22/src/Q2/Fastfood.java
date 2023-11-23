package Q2;

public class Fastfood extends Food{
    String type, flavour;
    Fastfood(double calories,double fat,double carb,String type,String flavour){
        super(calories,fat,carb);
        this.flavour=flavour;
        this.type=type;
    }
    void FastfoodReview(){
        System.out.println("Inside the review method of Fastfood class.");
    }
}
