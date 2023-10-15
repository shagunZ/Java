abstract class animal{
    abstract void noise();
}
abstract class pet extends animal{
    abstract void color();
    void noise(){
        System.out.println("noise in pet");
    }
}
public class abs extends pet{
    // void noise(){
    //     System.out.println("makenoise");
    // }
    void color(){
        System.out.println("colorit");
    }
    public static void main(String[] args) {
        abs a = new abs();
        a.noise();
        a.color();
        /////////////
        animal a1 = new abs();
        a1.noise();
        ////////////
        pet a2 = new abs();
        a2.noise();
        a2.color();
    }
}
