import java.util.Scanner;
class Add
{
    public static void main(String a[])
    {
        int n1;
        int n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1st");
        n1=sc.nextInt();
        System.out.println("Enter Number 2nd");
        n2=sc.nextInt();
        int n=n1+n2;
        System.out.println("Addition-"+n);
        int p=n1-n2;
        System.out.println("Subtraction-"+p);
        int q=n1*n2;
        System.out.println("Multiplication"+q);
        int r=n1/n2;
        System.out.println("Divition"+r);
        
    }
}