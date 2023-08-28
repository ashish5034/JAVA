import java.util.Scanner;
public class Div
{
	public static void main(String a[])
	{
		int z;
        int b;
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of Z");
	
        z=sc.nextInt();
        System.out.println("Enter Value of b");
        
        b=sc.nextInt();
        System.out.println("Division=");
        int c=z/b;
		System.out.println(c);
	}

}
