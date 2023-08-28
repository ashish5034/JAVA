import java.util.Scanner;
class Circle 
{
    public static void main(String a[])
    {
        double pi;
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of Pi constant");
pi=sc.nextDouble();
System.out.println("Enter Radius of circle");
r=sc.nextInt();
        double area=pi*r*r;
        System.out.println(area);

    }
}
