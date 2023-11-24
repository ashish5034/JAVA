class Final1
{
    public static void main(String args[])
    {
        Demo dobj = new Demo();
        System.out.println("a: "+dobj.a);
        System.out.println("b: "+dobj.b);
        dobj.a++;
        // dobj.b++;
        Demo dobj2 = new Demo(51,101);
        System.out.println("a: "+dobj2.a);
        System.out.println("b: "+dobj2.b);

    }
}
class Demo
{
    public int a;
    public final int b;
    Demo()
    {
        a=11;
        b=21;
    }
    Demo(int i, int j)
    {
        a=i;
        b=j;
    }
}