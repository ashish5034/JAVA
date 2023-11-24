
class Multi1
{
    public static void main(String[] args) 
    {
        System.out.println("Inside Main thread...");

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.start();  //start method extends from the Thread Class
        obj2.start();
    }
}

class Demo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running ...");
    }
}