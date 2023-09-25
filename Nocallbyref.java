import java.util.*;
// class Number{
//     int value;
//     Number(int value){
//         this.value= value;
//     }

    
// }

public class Nocallbyref {

    public static void swap(int a,int b){
        int temp = a;
        a  = b ;
        b  = temp;
    }
    public static void main(String[] args) {
       int num1 = 10;
       int num2=20;

        System.out.println("before swap: " + num1  + " " + num2 );

        swap(num1, num2);

        System.out.println("after swap: " + num1 + " " + num2 );

    }
}
