class Heirarcal{
    public static void main(String arg[])
    {
        DerivedX dobj1 = new DerivedX();
        Derived dobj2 = new Derived();
       
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
        System.out.println("Derived constructor");
    }
    public void gun(){
        System.out.println("Derived gun");
    }
}
class DerivedX extends Base{
    public int p,q;
    public DerivedX(){
        System.out.println("DerivedX constructor");
    }
    public void sun()
    {
        System.out.println("DerivedX sun");
    }
}