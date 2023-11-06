class myThread extends Thread{
    public int node;
    public myThread(){
        System.out.println("hello");
    }
    public myThread(int node){
        this.node = node;
    }
    public void run(){
        if(node==1){
            System.out.println("one");
        }
        if(node==2){
            System.out.println("two");
        }
    }
}

public class multiThreading {
    public static void main(String[] args) {
        myThread mt = new myThread();
        System.out.println(mt.getState());
        mt.start();
        System.out.println(mt.getState());
        mt.setName("user thread");
        myThread mt2 = new myThread();
        mt2.start();
        mt2.setName("user thread2");
        System.out.println(mt2.getName());
    }
}
