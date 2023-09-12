import java.util.Random;

public class random {
    public static void main(String args[]){
        Random ran = new Random();
        int x = ran.nextInt(10);
        // new Random().nextInt(5 + 1)  + 10 // [0...5]  + 10 = [10...15]


        //within range 
        // new Random().nextInt((max - min) + 1) + min
        int y = new Random().nextInt((20 - 10) + 1) + 10;
        System.out.println("x="+x + " y="+y);

    }
}
