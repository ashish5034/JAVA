import java.util.Scanner;
public class Max {
    public static void main(String a[])
    {
        int c;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value is c");
        c=sc.nextInt();
        System.out.println("Enter value is b");
        b=sc.nextInt();
        if(c>b)
        {
            System.out.println("c is greater than b");
        }else{
            System.out.println("b is greater than c");
        }

    }
    
}
