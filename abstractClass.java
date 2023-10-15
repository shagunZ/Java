abstract class demo{
    int x = 5; 
    abstract void mee();
    void mee1(){
        System.out.println("mee1 in demo");
    }
}

public class abstractClass extends demo{
    int x = 7; 
    void m(){
       System.out.println("m");
    }

    void mee(){
        System.out.println("mee in abstractClass");
    }
    public static void main(String[] args) {
        // demo d= new demo(); //not allowed
        demo d =new abstractClass();
        d.mee();
        d.mee1();
    }
}
