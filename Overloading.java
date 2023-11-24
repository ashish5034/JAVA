
class Overloading
{
    public static void main(String args[])
    {
        Arithmetic aobj = new Arithmetic();

        int iret=0;
        double dret=0.0;

        iret=aobj.Addition(10, 11);
        System.out.println("Addition is : "+iret);

        iret =aobj.Addition(10, 11, 21);
        System.out.println("Addition is : "+iret);

        dret=aobj.Addition(10.8,11.7);
        System.out.println("Addition is : "+dret);
    }
}

class Arithmetic
{
    public int Addition(int a, int b)
    {
        return a+b;
    }
    public int  Addition(int a, int b, int c)
    {
        return a+b+c;
    }
    public double Addition(double a, double b)
    {
        return a+b;
    }
    
}