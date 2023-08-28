import java.util.Scanner;

import java.util.Scanner;
public class Areatriangle 
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
    double base;
    double height;
    System.out.println("ENter Base of Triangle");
    base=sc.nextDouble();
    System.out.println("ENter height of Triangle");
    height=sc.nextDouble();
    System.out.println("Area of Triangle");
    double area=0.5*base*height;
    System.out.println(area);
    }
}
