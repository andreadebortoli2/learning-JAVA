import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo19 {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(9);

        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(5);

        nums2.indexOf(5);

        Set<Integer> nums3 = new HashSet<Integer>();
        nums3.add(4);
        nums3.add(8);
        nums3.add(7);
        nums3.add(4); // set not contain duplicate elements

        Set<Integer> nums4 = new TreeSet<Integer>(); // sorted elements
        nums4.add(4);
        nums4.add(8);
        nums4.add(7);
        nums4.add(4);

        Map<String, String> users = new HashMap<>();
        users.put("John", "Doe");
        users.put("Mary", "Jane");
        for (String key : users.keySet()) {
            System.out.println(key + " : " + users.get(key));
        }

    }
}
