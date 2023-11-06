public class innerclass {
    int x = 7;
    void demo1(){
        System.out.println("demo1 of enclosing");
    }
    static void demo2(){
        System.out.println("demo2 of enclosing");
    }
    static class Inner{
        int y = 3; 
        void demo3(){
            innerclass d = new innerclass();
            d.demo1();
            System.out.println("demo3 of inner"+ d.x);
            innerclass.demo2();
        }
       static void demo4(){
            System.out.println("innerfunction");
            innerclass e = new innerclass();
            e.demo1();
            demo2();
            System.out.println("demo4: "+e.x);
        }
    }
    public static void main(String[] args) {
        innerclass i = new innerclass();
        i.demo1();
        demo2();
        
        //if class is not static then object:
        // innerclass.Inner t = i.new Inner();

        innerclass.Inner t = new Inner();
        // innerclass.Inner t = new innerclass.Inner();
        t.demo3();
        Inner.demo4();

        
        Inner s = new Inner();
        s.demo3();
        s.demo4();
        
    }
}
