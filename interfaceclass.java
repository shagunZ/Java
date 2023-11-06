interface A {
    int x = 3;
    void m1();
}
interface B extends A{
    void m2();
}
interface C extends B{
    void m3();
}
interface D{
    int y = 4; 
    static void m4(){
        System.out.println("m4");
    }
    default void m5(){
        System.out.println("m5");
    }
}

// public class interfaceclass implements A,B{
public class interfaceclass implements C,D{
        public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
    public void m3(){
        System.out.println("m3");
    }
    public static void main(String[] args) {
        B a = new interfaceclass();
        a.m1();
        a.m2();
System.out.println(a.x); 
System.out.println(A.x); //bcz static
        //static
        D.m4();
        System.out.println(D.y);
        D d = new interfaceclass();
        d.m5();
    }
}
