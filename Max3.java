import java.util.Scanner;
public class Max3 {
    public static void main(String a[])
    {
        
        int c;
        int b;
        int d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number c=");
c=sc.nextInt();
System.out.println("Enter Numbe b=");
b=sc.nextInt();
System.out.println("Enter Number d=");
d=sc.nextInt();
        if(c>b && c>d)
        {
            System.out.println("c is greater");
        }else if(b>d)
            {
            System.out.println("b is greater");
        }else {
            System.out.println("d is greater");
        }

    }
    
}
