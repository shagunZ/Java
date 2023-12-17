class Numbers11 implements Runnable
{
    int mode;
    Numbers11(int m)
    {
        this.mode=m;
    }
    @Override
    public void run()
    {
        if(mode==0)
        {
            System.out.println("Even Number Thread Status during execution: " + Thread.currentThread().getState());
            for (int i = 0; i <= 100; i += 2) {
                System.out.println("Even Number: " + i);
            }
        }
        else
        {
            System.out.println("Fibonacci Number Thread Status during execution: " + Thread.currentThread().getState());
            int n = 100;
            int a = 0, b = 1;
            System.out.println("Fibonacci Series: " + a);
        while (b <= n) 
        {
            System.out.println("Fibonacci Series: " + b);
            int temp = a + b;
            a = b;
            b = temp;
           }
        }
    }
}
public class ThreadMinor2 {
    public static void main(String[] args) throws InterruptedException
    {
         Numbers11 t1=new Numbers11(0); // print even Number
         Numbers11 t2=new Numbers11(1);  //print fibonacci series
         Thread x1=new Thread(t1);
         Thread x2=new Thread(t2);
         System.out.println("Even Number Thread Status before execution: " + x1.getState());
         System.out.println("Fibonacci Number Thread Status before execution: " + x2.getState());

         x1.setPriority(Thread.MAX_PRIORITY);
         x2.setPriority(Thread.MAX_PRIORITY);
         
         x1.start();
         x1.join();
         x2.start();
         x2.join();
         
         System.out.println("Even Number Thread Status after execution: " + x1.getState());
         System.out.println("Fibonacci Number Thread Status after execution: " + x2.getState());
         
    }
}