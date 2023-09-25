import java.util.Scanner;
public class Tut1{
    public static void main(String[] args){
        int age = 22;
        float averagemarks = 3.33f;
        char grade = 'A';
        System.out.println(grade);
        System.out.println(averagemarks);
        System.out.println("Hello World");
        System.out.println(age);

//widening tapecasting
        int x = 7 ; 
        long y = x; 
        float t = y;
        double z = t ;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);

//narrowing typecasting 
/*
 * doubel->float
 * ->long->int->char->short->byte
 */
        long l = (long)z;
        System.out.println(l);
        //primitive data types jinka size defined hai
        //non primitive data types jinka size hum define karte hain scanner se
        
        Scanner sc = new Scanner(System.in);
        // int roll  =sc.nextInt();  //take int input
        // float num  =sc.nextFloat();  //take float input
        String str =sc.nextLine();  //take string input
        // System.out.println("roll is :"+ roll +"\n num is:" + num );
        System.out.print("\nstr is:"+str+"\n");



        //input
        // int marks[] = new int[5];
        // // int marks[] = {22,33,44,55,66};
        // Scanner mk = new Scanner(System.in);
        // for(int i=0;i<marks.length;++i ){
        //     marks[i] =mk.nextInt();
        //     }
        //     for(int i=0;i<marks.length;i++ ) {
        //     System.out.println(i+1 +":"+marks[i]);
        //     }

            //method
            //returntype functionname (arguments){}
            System.out.println(average(3,4));

    }


    
           static int average(int firstNum,int secNum){
                return firstNum+secNum;
            }
}