import java.util.*;
class Number{
    int value;
    Number(int value){
        this.value= value;
    }
}

public class Nocallbyref {

    public static void swap(Number a,Number b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
    public static void main(String[] args) {
        Number num1 = new Number(10);
        Number num2 = new Number(20);

        System.out.println("before swap: " + num1.value + " " + num2.value);

        swap(num1, num2);

        System.out.println("after swap: " + num1.value + " " + num2.value);

    }
}
