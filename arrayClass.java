import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class arrayClass {
    public static void main(String[] args) {
        // int[] numbers={1,2,3,4,5,6,7,8,9,10};
        // int index = Arrays.binarySearch(numbers, 4)
        int[] numbers={21,12,43,14,25,36,17,28,39,10};
        Arrays.sort(numbers);

        // Arrays.fill(numbers,12);

        for(int i:numbers){
            System.out.println(i+" ");
        }


        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(23);
        list.add(43);
        list.add(53);
        list.add(36);
        list.add(31);
        list.remove(1);

        System.out.println("get:"+list.get(2));
        System.out.println("min:"+Collections.min(list));
        System.out.println("max:"+Collections.max(list));
        System.out.println(Collections.frequency(list,23));
        
        
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }
}
