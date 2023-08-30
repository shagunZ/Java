import java.util.Scanner;

public class Tut6 {
    public static void main(String[] args){
        //1D array
        int [] arr = {2,3,4};
        int[] Arr = new int[4];
        for(int i:arr)System.out.println(i);
        //2D array
        int[][] arr2 = {{01,10},{20,30}};
        int[][] Arr2 ;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("size: "+size);
        Arr2 = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Arr2[i][j] = sc.nextInt();
            }
        }
        //display2dinputarray
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(Arr2[i][j]+" ");
            }
            System.out.println(" ");
        }

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++)
            System.out.println(arr2[i][j]);
        }
        for(int[] i:arr2){
            for(int j:i)
            System.out.println(j);
        }
        //3D array
        System.out.println("3d arrya");
        int [][][] arr3 = {{{9,8},{7,6}},{{5,4},{3,2}}};
        int [][][] Arr3 = new int[4][4][4];
        for(int[][] i:arr3){
            for(int[] j:i){
                for(int k: j){
                    System.out.println(k);
                }
            }
        }
}
}
