import java.util.*;
class ExceptionDemo1X
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second number: ");
        int iNo2 = sobj.nextInt();

        int iAns = 80085;
        try
        {
            System.out.println("Inside try block: ");
            iAns = iNo1/iNo2;
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch block1: "+obj);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Inside catch block2: "+obj);
        }
        catch(Exception obj)
        {
            System.out.println("inside generic catch block: "+obj);
        }
        finally
        {
            System.out.println("Inside finally block: ");
        }
        System.out.println("Division is : "+iAns);
    }
}