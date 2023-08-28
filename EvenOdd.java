import java.util.Scanner;
public class EvenOdd {

public static void main(String a[])
{
    int no;
Scanner sc=new Scanner(System.in);
System.out.println("Enter No to Decide Even Or Odd");
no=sc.nextInt();
if(no%2==0)
{
    System.out.println("No is Even");
    System.out.println(no);
}
else 
{
    System.out.println("No is Odd");
    System.out.println(no);
}  
}
}
