
class Overriding
{
    public static void main(String args[])
    {
        Base bobj = new Derived();//up casting 
        // Base bobj = new Base();//no casting 
        // Derived dobj = new Derived();// no casting
        // Derived dobj = new Base();//down casting
        bobj.fun();  //inside derived fun
        bobj.gun(); //base gun
        bobj.sun();//derived sun
        bobj.run();//base run
        // bobj.run(11);
        // bobj.mun();
    }
}
class Base
{
    public void fun()      //1000
    {
        System.out.println("Inside base fun");
    }
    public void gun()      //2000
    {
        System.out.println("Inside base gun");
    }
    public void sun()      //3000
    {
        System.out.println("Inside base sun");
    }
    public void run()       //4000
    {
        System.out.println("Inside base run");
    }
}
class Derived extends Base
{
    public void fun()       //5000
    {
        System.out.println("Insdide derived fun");
    }
    public void sun()       //6000
    {
        System.out.println("Insdide derived sun");
    }
    public void run(int A)  //7000
    {
        System.out.println("Insdide derived run");
    }
    public void mun()       //8000
    {
        System.out.println("Insdide derived mun");
    }
}
