public class StaticNonStaticInnerClass{

    // Static nested class
    static class InnerClass {
        public void msg() {
            System.out.println("Data is " + data);
        }
        public static void msgdemo() {
            System.out.println("demoData is " + data);
        }
    }

    // Non-static nested class
    // public void inn(){
        class InnerClass2 {
            public void msg() {
                System.out.println("Data2  is " + data);
            }
        }
    //  InnerClass2 inner = new InnerClass2();
    //  inner.msg();   
    // }
    static int data = 30;

    public static void main(String[] args) {
        // Accessing static nested class
        StaticNonStaticInnerClass.InnerClass.msgdemo();
        StaticNonStaticInnerClass.InnerClass staticInner = new StaticNonStaticInnerClass.InnerClass();
        staticInner.msg();

        // Accessing non-static nested class
        StaticNonStaticInnerClass outerClass = new StaticNonStaticInnerClass();
        StaticNonStaticInnerClass.InnerClass2 innerClass2 = outerClass.new InnerClass2();
        innerClass2.msg();


        //function vala
        // outerClass.inn();
    }
}