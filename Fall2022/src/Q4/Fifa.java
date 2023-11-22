package Q4;

public class Fifa {
    private int noOfGoals;
    String venue;
    public Fifa(){
        System.out.println("Who will be winner?");
    }
    public Fifa(int noOfGoals,String venue){
        this.noOfGoals=noOfGoals;
        this.venue=venue;
    }
    public String toString(){
        return "Fifa-> noOfGoals: "+noOfGoals+", Venue: "+venue;
    }
    public int getNoOfGoals(){
        return noOfGoals;
    }


    public static void main(String[] args) {
        BrazilFans brazilFans= new BrazilFans(7,"Qatar",5);
        System.out.println(brazilFans);
    }
}

class BrazilFans extends Fifa{
    int havingWorldCup;
    public BrazilFans(){
        System.out.println("Brazil will win");
    }
    public BrazilFans(int noOfGoals, String venue, int havingWorldCup){
        super(noOfGoals,venue);
        this.havingWorldCup=havingWorldCup;
    }
    public String toString(){
        return "BrazilFans->["+super.toString()+"] havingWorldCup: "+havingWorldCup;
    }
}

class ArgentinaFans{

}

