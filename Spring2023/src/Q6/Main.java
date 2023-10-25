package Q6;

class Main{
    public static void main(String[] args) {
        Cake cake[] =new Cake[2] ;
// Complete the code

        cake[0]=new OrderCake("Order cake",3,150);
        cake[1]=new ReadymadeCake("Readymade cake ",2,200);
        for (int i = 0; i < cake.length; i++) {
            cake[i].printDetails();
        }
    }
}
