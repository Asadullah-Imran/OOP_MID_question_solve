package Q2.M1;

public class Human {
    private int id;
    String intelligence;
    protected boolean bravery;

    public int getId() {
        return id;
    }
    {
        System.out.println("To avoid getting scared or eaten be brave or intelligent.");
    }
    public boolean getBravery(){
        return bravery;
    }
    public Human(int id, String intelligence, boolean bravery){
        this.id=id;
        this.intelligence=intelligence;
        this.bravery=bravery;
    }
}
