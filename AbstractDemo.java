class AbstractDemo
{
    public static void main(String args[])
    {
        System.out.println("Innside main");
        // Demo obj = new Demo();  Demo is abstract; cannot be instantiated
        Hello hobj = new Hello();
        hobj.fun();
        hobj.gun();
    }
}

abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Constructor Demo");
        this.A=0;
        this.B=0;
    }
    // virtual void fun()=0;
    abstract void fun();
    void gun()
    {
        System.out.println("Inside gun of demo");
    }
}
class Hello extends Demo
{
    public Hello()
    {
        System.out.println("Inside constructor hello");
    }
    public void fun()
    {
        System.out.println("Inside fun of hello");
    }
}