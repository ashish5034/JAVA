import java.util.*;
class ExceptionDemo3
{
    public static void main(String args[])
    {

    }
}
class Demo
{
    public void Division()
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second number: ");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNo1/iNo2;

        System.out.print(iAns);
    }
}