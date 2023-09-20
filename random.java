import java.util.Random;
import java.math.BigInteger;
import java.lang.Math;

public class random {
    public static void main(String args[]){
        Random ran = new Random();
        int x = ran.nextInt(10);
        // new Random().nextInt(5 + 1)  + 10 // [0...5]  + 10 = [10...15]
int z = ran.nextInt((5-3)+1) +3 ;
System.out.println(z);

        //within range 
        // new Random().nextInt((max - min) + 1) + min
        int y = new Random().nextInt((20 - 10) + 1) + 10;
        System.out.println("x="+x + " y="+y);





        // double t = Math.pow(1,4);
        // System.out.println(t);
        // System.out.println(Math.min(x,y));

        //  BigInteger b1 = new BigInteger("1111111");
        //  System.out.println(b1);
        //  BigInteger b2 = BigInteger.valueOf(123456789);
        //  System.out.println(b2);

    }
}
