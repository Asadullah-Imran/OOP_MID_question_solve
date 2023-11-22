package q3.b;

public class Test {
    public static void main(String[] args) {
        Book book1,book2;
        book1 = new Book();
        book2= new PaperBackBook();
        book1.description();
        book2.description();
        ((PaperBackBook)book2).putPageMarker(50);
    }
}
