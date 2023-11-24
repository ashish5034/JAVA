import Marvellous.Maths;
import Marvellous.Infosystems.Arithmatic;
class PackageDemo
{
    public static void main(String args[])
    {
        Maths mobj =new Maths();
        Arithmatic aobj = new Arithmatic();

        int iret = 0;
        iret = mobj.Addition(10, 11);
        System.out.println(iret);

        iret = aobj.Substraction(11, 10);
        System.out.println(iret);
        
    }
}