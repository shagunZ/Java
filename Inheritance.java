class Base {
    int x = 1;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    Base() {
        System.out.println("constructor of base");
    }

    Base(int x) {
        System.out.println("x=" + x);
    }

    void display() {
        System.out.println("this is A");
    }
}

class Derived extends Base {
    int y = 3;

    // void display(){
    // System.out.println("derived");
    // }
    Derived() {
        System.out.println("constructor of derived");
    }
}

public class Inheritance {
    public static void main(String args[]) {
        System.err.println("main");
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());
        Base b2 = new Base(9);
        System.out.println("//////////////////////////");
        Derived d = new Derived();
        d.setX(88);
        System.out.println(d.getX());
        d.display();
        System.out.println("//////////////////////////");

        Base parent = new Derived();
        parent.setX(44);
        System.out.println(parent.getX());
        parent.display();
    }
}
