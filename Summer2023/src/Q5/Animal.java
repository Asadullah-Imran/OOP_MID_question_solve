package Q5;

abstract class Animal {}
class Baby extends Animal {
    public double age;
}
class Cat extends Animal {
    public void sleep(int time) {
        System.out.println("Sleeping");
    }
}
