import java.util.Scanner;
class Movie{
    String name;
    int price;
    String city;
    double ceat;
    void displayMovie()
    {
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Movie name       "+name);
        System.out.println("Movie price      "+price);
        System.out.println("theator city     "+city);
        System.out.println("ceat no          "+ceat);
        System.out.println("+++++++++++++++++++++++");
    }
    String showName(){
        return name;

    }
}
public class Movie1{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        Movie m=new Movie();
        m.name="KGF";
        m.price=200;
        m.city="Pune";
        m.ceat=100;
        m.displayMovie();
        System.out.println("++++++++++++++++++++++++++");
        Movie m1=new Movie();
        System.out.println("Enter Movie name ");
        m1.name=sc.next();
        System.out.println("Enter movie price ");
        m1.price=sc.nextInt();
        System.out.println("Enter Movie City   ");
        m1.city=sc.next();
        System.out.println("Enter movie theater ceats");
        m1.ceat=sc.nextDouble();
        m1.displayMovie();
        String name=m1.showName();
        System.out.println(name);
        
    }
    
}
