import java.util.Scanner;
public class Rectangle {
    
    public static void main(String a[])
    {
        int w;
        int h;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Width of Rectangle");
        w=sc.nextInt();
        System.out.println("Enter Height of Rectangle");
        h=sc.nextInt();
        int area=w*h;
        System.out.println("Area OF Reactangle is -"+area);
    }
}
