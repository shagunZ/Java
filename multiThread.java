class myThread extends Thread{
    public int node;
    public myThread(){
        System.out.println("hello");
    }
    public myThread(int node){
        this.node = node;
    }
    public void run(){
        for(int i =0;i<20;i++){
            System.out.println(i);
        }
    }
}

public class multiThread {
    public static void main(String[] args) {
        myThread mt = new myThread();
        System.out.println(mt.getState());
        mt.start();
        try {
            mt.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(mt.getState());
        mt.setName("user thread");
         for(int i =20;i<30;i++){
            System.out.println(i);
        }
    // try {
    //         mt.join(); // Wait for the thread to finish
    //     } catch (InterruptedException e) {
    //         e.printStackTrace();
    //     }
    }
}
