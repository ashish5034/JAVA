import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Rev {
    public static void main(String a[])
    {
        int no;
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number =");
        no=sc.nextInt();
        System.out.println(no);
       int n=no;
while(no!=0)
{
    int rem=no%10;
    reverse=reverse*10+rem;
    no=no/10;
}
System.out.println("Reverse of the given no is"+reverse);
if(n==reverse)
    {
        System.out.println("pal");
    }
    else 
    {
        System.out.println("not pal");
    }
    }
    

    
}
