
class OverloadingX
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

        aobj.Addition(11,99.99);
        aobj.Addition(90.99, 11);
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
    public void Addition(int a, double b)
    {
        System.out.println("INSDIE 1ST ADDITION");
    }
    public void Addition(double a, int b)
    {
        System.out.println("INSDIE 2ND ADDITION");   
    }
}