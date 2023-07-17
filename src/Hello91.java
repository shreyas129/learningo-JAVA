import java.util.ArrayList;
import java.util.Collection;

public class Hello91 {
    public static void main(String a[]) {
        Collection nums = new ArrayList();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        for(int n : nums) {
            System.out.println(n);
        }
    }
}