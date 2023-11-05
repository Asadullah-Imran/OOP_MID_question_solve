package Q2.M1;

public class Monster {
    String name;
    double weight;
    public  Monster(String name,double weight){
        this.name=name;
        this.weight=weight;
    }


    public void increaseWeight(double weight) {
        System.out.println("New weight of monster="+(this.weight+weight));
    }
    public boolean eat(Human h){
    if(h.intelligence == "high"){
        return false;
    }else{
        increaseWeight(10);

    }
        return true;
        //check intelligence and return a boolean value
    }
    public String scare(boolean bravery){
//check bravery and return a string
        if(bravery){
    return "Human is too brave to scare.";
        }
        return  "Human scared" ;
    }
}