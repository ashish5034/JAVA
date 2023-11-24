class Single{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();
        dobj.fun();
        dobj.gun();
       
    }
}
class Base{
    public int A;
    public int B;
    public Base(){
        System.out.println("Base constructor");
    }
    public void fun()
    {
        System.out.println("Base fun");
    }
}
class Derived extends Base{
    public int x;
    public int y;
    public Derived(){
        System.out.println("Derived class");
    }
    public void gun(){
        System.out.println("Derived gun");
    }
}