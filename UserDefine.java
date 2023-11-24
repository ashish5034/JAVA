import java.util.*;
class UserDefine
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter ur Age: ");
        int Age = sobj.nextInt();

        try
        {
            if(Age < 18)
            {
                AgeInvalid aobj = new AgeInvalid("Ur age is below 18");
                throw aobj;
                // throw new AgeInvalid("Ur age is below 18");
            }
            else
            {
                System.out.println("Login Succesfully...");
            }
        }
        catch(AgeInvalid obj)
        {
            System.out.println("Inside catch block");
            System.out.println(obj);
        }
    }
}
class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}