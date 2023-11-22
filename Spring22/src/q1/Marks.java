package q1;

public class Marks {
    String id;
    double quizMark;
    double midMark;
    double finalMark;

    public Marks(String id,double quizMark,double midMark,double finalMark){
        this.id =id;
        this.quizMark= quizMark;
        this.midMark= midMark;
        this.finalMark= finalMark;
    }

    public void passedOrNot(){
        double sum= quizMark+midMark+finalMark;
        if(sum>=55){
            System.out.println("passed!");
        }else{
            System.out.println("failed");
        }
    }

    public static void main(String[] args) {
        Marks asad= new Marks("0112310574",18,16,3);
        asad.passedOrNot();
    }

}
