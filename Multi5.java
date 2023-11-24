class Multi5 {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Current Thread Is: " + Thread.currentThread().getName());

        Demo obj1 = new Demo(); // New state 
        obj1.start(); // Runnable state
        obj1.join();
        System.out.println("Main is at  dead state"); // This line will execute immediately after the 'start()' method call
    }
}

class Demo extends Thread {
     public void run() {
        for (int i = 1; i <= 10; i++)
        try
        { 
            System.out.println("Value of i is : "+i);
            Thread.sleep(500);
        }
        catch(Exception obj)
        {}
        System.out.println("End of Thread");
    }
}