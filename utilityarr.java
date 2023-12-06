import java.util.*;

public class utilityarr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[arr1.length];
        int[] arr3 = {5,6,4};

        Arrays.fill(arr2,0);
        System.out.println("arr2fill"+Arrays.toString(arr2));
        Arrays.sort(arr3);
        System.out.println("arr3sort"+Arrays.toString(arr3));
        System.out.println("arr1comparedtoarr3"+Arrays.compare(arr1,arr3));
        int bs = Arrays.binarySearch(arr1, 3);
        System.out.println(bs);
    }

}
