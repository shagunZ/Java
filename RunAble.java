class myThread implements Runnable {
    public void run() {
        System.out.println("runnable");
    }
}

public class RunAble {
    public static void main(String[] args) {
        myThread mt = new myThread(); // Create an instance of your custom Runnable class
        Thread t1 = new Thread(mt); // Create a new Thread and pass the Runnable instance as an argument
        t1.start(); // Start the thread
    }
}
