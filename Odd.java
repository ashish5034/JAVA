import java.util.Scanner;
public class Odd {
    public static void main(String a[])
    {
int i,no;
Scanner sc=new Scanner(System.in);
no=sc.nextInt();
for(i=0;i<=no;i++)
{
    if(i%2==0)
    {
    System.out.println("Even No"+i);
    }else
    {
        System.out.println("odd no"+i);
    }
}
    }
    
}
