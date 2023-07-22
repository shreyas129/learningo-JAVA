import java.util.*;

public class Hello92 {
    public static void main(String a[]) {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()) {
            System.out.println(values.next());
        }
        // for(int n : nums) {
        //     System.out.println(n);
        // }
    }
}