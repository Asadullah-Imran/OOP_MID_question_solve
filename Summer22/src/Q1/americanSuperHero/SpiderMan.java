package Q1.americanSuperHero;

public class SpiderMan {
    String movieName,directedBy;
    SpiderMan(String movieName,String directedBy){
        this.directedBy=directedBy;
        this.movieName=movieName;
    }
    void show(){
        System.out.println("Movie name: "+movieName);
        System.out.println("Directed By :"+directedBy);
    }
}
