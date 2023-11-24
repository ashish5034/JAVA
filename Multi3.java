class Multi3 {
    public static void main(String[] args) {
        System.out.println("Current Thread Is: " + Thread.currentThread().getName());

        Demo obj1 = new Demo(); // New state
        Demo obj2 = new Demo(); // New state
        
        obj1.setName("First_thread");
        obj2.setName("Second_Thread");

        obj1.start(); // Runnable state
        // obj1.join();
        obj2.start(); // Runnable state
        // obj2.join();
        
        System.out.println("Thread goes to dead state"); // This line will execute immediately after the 'start()' method call
    }
}

class Demo extends Thread {
    public void run() {
        System.out.println("Current Thread Is: " + Thread.currentThread().getName());
        System.out.println("Current Thread is: " + getName());
        for (int i = 1; i <= 10; i++) { // Changed the loop upper bound to 10 for brevity
            System.out.println("Name of thread is: " + getName() + " with counter: " + i);
        }
    }
}
