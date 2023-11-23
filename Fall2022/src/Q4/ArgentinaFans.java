package Q4;

public class ArgentinaFans extends Fifa{
        int havingWorldCup;
        {
                System.out.println("Argentina will win");
        }
        public ArgentinaFans(int noOfGoals, String venue, int havingWorldCup){
                super(noOfGoals,venue);
                this.havingWorldCup=havingWorldCup;
        }
        public String toString(){
                return "Argentina->["+super.toString()+"] havingWorldCup: "+havingWorldCup;
        }
        void incrementWordCup(){
                havingWorldCup++;
        }
        }
