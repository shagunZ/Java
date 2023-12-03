import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashset {
    public static void main(String[] args) {
        //no duplicates elements
        // Set<Integer> set = new HashSet<>();
        //to maintain order ->linkedhashset
        // Set<Integer> set = new LinkedHashSet<>();
        
        //unique nd binarysearchformat ie sorted
        Set<Integer> set = new TreeSet<>();
        set.add(22);
        set.add(2);
        set.add(32);
        set.add(22);
        set.add(2);
        System.out.println(set); //prints random order
        
        //removing element from the set
        set.remove(22);
        System.out.println(set);

        System.out.println(set.contains(4));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
