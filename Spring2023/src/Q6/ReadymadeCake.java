package Q6;

class ReadymadeCake extends Cake{
    int quantity;
    public ReadymadeCake(String n, double r, int q){
        super(n, r);
        quantity = q;
    }
    public double calcPrice(){
        return super.rate*quantity;
    }
    public void printDetails(){
        System.out.println("Prints the detail.");
        System.out.println("Name: "+name);
        System.out.println("Rate: "+rate);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+calcPrice());

    }
//override calcPrice & printDetails
}