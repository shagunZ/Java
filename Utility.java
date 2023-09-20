import java.util.Arrays;

public class Utility {
    public static void main(String[] args) {
        int [] arr = {1,-2,5,-4,3};
        // Arrays.sort(arr);
        Arrays.sort(arr, 0, 3);
        for(int i:arr)System.out.println(i);

        // int[] arr1 = Arrays.copyOf(arr);
        //         for(int i:arr1)System.out.print(" "+i);

    }
}
