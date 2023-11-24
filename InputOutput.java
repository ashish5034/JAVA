import java.util.*;

class InputOutput
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First Number:");
        int no1=sobj.nextInt();

        System.out.println("Enter First Number:");
        int no2=sobj.nextInt();

        int ans = 0;
        ans = no1 + no2;

        System.out.println("Addition is:"+ans);
            // sobj.close();
    }
}