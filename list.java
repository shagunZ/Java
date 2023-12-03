

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class list {
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>();
        //will work same and fine if we use this
        // List<Integer> arr = new LinkedList<>();
        // ArrayList arr = new ArrayList<>();
        arr.add(11);
        arr.add(12);
        System.out.println(arr);
        arr.add(13);
        System.out.println(arr);
        arr.add(1,33);
        System.out.println(arr);

        arr.set(0,700);
        System.out.println(arr);

        System.out.println(arr.contains(12));

////concating two lists
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(100);
        arr1.add(200);

        arr.addAll(arr1);
        System.out.println(arr);

        /////removing element
        arr.remove(1);
        System.out.println(arr);

        arr.remove(Integer.valueOf(100));
        System.out.println(arr);

        // arr.clear();
        // System.out.println(arr);
//forloop
        // for(int i =0;i<arr.size();i++){
        //     System.out.println("ele is"+arr.get(i));
        // }
//foreachloop
        // for( Integer ele: arr){
        //     System.out.println("foreach ele is"+ele);
        // }
//iterator
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            System.out.println("iterator"+it.next());
        }

    }
}
