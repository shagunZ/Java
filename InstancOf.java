class demo1{

}
class demo2 extends demo1{

}
public class InstancOf extends demo2{
    public static void main(String[] args) {
        InstancOf i = new InstancOf();
        demo2 d2 = new demo2();
        demo1 d1 = new demo1();
        InstancOf d4 = new InstancOf();
        
        System.out.println(i instanceof InstancOf);  //true
        System.out.println(d2 instanceof demo2);  //true
        System.out.println(d1 instanceof InstancOf);  //false
        System.out.println(d4 instanceof demo1);  //true
    }
}
