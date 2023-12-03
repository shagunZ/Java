import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> nums = new HashMap<>();
        //treemap prints in lexicographical order
        // Map<String, Integer> nums = new TreeMap<>();
        nums.put("one", 1);
        nums.put("two", 2);
        nums.put("three", 3);

        nums.remove("three");

        // if(!nums.containsKey("three")) {
        // nums.put("three", 23);
        // }

        nums.putIfAbsent("two", 22);
        System.out.println(nums);

        System.out.println(nums.containsValue(2));
        System.out.println(nums.isEmpty());
        //iterations
        for(Map.Entry<String,Integer> e: nums.entrySet()){
            // System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key:nums.keySet()){
            System.out.println(key);
        }

        for(Integer val:nums.values()){
            System.out.println(val);
        }
    }
}
