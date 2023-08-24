public class Tut5 implements Cars {
    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        t1.start();
    }

    public void starts() {
        System.out.println("my car is starting");
    }
}

class Tesla extends Car {
    // @Override
    void start() {
        System.out.println("Tesla is starting");
    }
}

class BMW extends Car {
    // @Override
    void start() {
        System.out.println("BMW is Starting");
    }
}

abstract class Car { // abstract means car is just an object now its object can't be created
    int price;

    abstract void start(); // shud not define here

    void breaks() {
        System.out.println("car is breaking");
    }
}

interface Cars {
    void starts(); // bydefault public abstract
}