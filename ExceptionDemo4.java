import java.util.*;
class ExceptionDemo4
{
    public static void main(String args[])
    {
        Demo dobj = new Demo();
        try
        {
            System.out.println("Inside try block");
            dobj.Division();
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch"+obj);
        }
        finally
        {
            System.out.println("Inside finally");
        }
    }
}
class Demo
{
    public void Division() throws ArithmeticException
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second number: ");
        int iNo2 = sobj.nextInt();

        int iAns =0;
        iAns = iNo1/iNo2;
        System.out.println("Division is : "+iAns);
    }
}