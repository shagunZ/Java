class TotalEarning extends Thread
{
    int total=0;
    public void run()
    {
        synchronized(this)
        {
            for(int i=1;i<=10;i++)
            {
                total+=100;
            }
            this.notify();
        }
    }
}
public class WaitAndNotify {
    public static void main(String[] args)throws InterruptedException
    {
        TotalEarning te=new TotalEarning();
        te.start();
        
        synchronized(te)
        {
            te.wait();
            System.out.println("Total earning: "+ te.total);
        }
    }
}
