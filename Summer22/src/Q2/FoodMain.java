package Q2;

public class FoodMain {
    public static void main(String[] args) {

        //I am not sure about the main classs
        //this type question will not come in our mid
        // this is a polymorphism problem


        Food f1= new Homemade(200,21,54,23);
        Food f2= new Fastfood(300,23,18,"flovour","type");

        f1.description();
        f2.description();

        f1.HomemadeReview();
        f2.FastfoodReview();
    }
}
