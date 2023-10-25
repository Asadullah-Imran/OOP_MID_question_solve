package Q5;

public class Main {
    public void speak(Animal target) {
//write your code here
        if(target instanceof Baby){
            System.out.println("Waaahhh");
        }else if(target instanceof Cat){
            System.out.println("meow");
        }else{
            System.out.println("Grrrr");
        }
    }


    public static void main(String[] args) {
        Baby baby= new Baby();
        Cat cat = new Cat();
        Main main =new Main();
        main.speak(baby);
        main.speak(cat);

    }
}
