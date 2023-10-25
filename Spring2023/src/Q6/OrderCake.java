package Q6;

class OrderCake extends Cake{
    double weight;
    public OrderCake(String n, double r, double w){
        super(n, r);
        weight = w;
    }
    public double calcPrice(){
        return super.rate*this.weight;
    }
    public void printDetails(){
        System.out.println("Prints the detail.");
        System.out.println("Name: "+super.name);
        System.out.println("Rate: "+super.rate);
        System.out.println("Weight: "+weight);
        System.out.println("Price: "+calcPrice());
    }
//override calcPrice & printDetails
}
