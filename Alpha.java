import java.util.Scanner;
public class Alpha {
    public static void main(String a[])
    {
         char ch;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Character ");
         ch=sc.next().charAt(0);
         if(((ch>'a')&&(ch<'z'))||((ch>'A')&&(ch<'z')))
         {
            System.out.println("Character is Alphabet");
         }else 
         {
            System.out.println("Character is Not Alphabet");
         }
    }
    
}
