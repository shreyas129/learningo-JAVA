import java.util.HashMap;
import java.util.Map;

public class Hello93 {
    public static void main(String a[]) {

        Map<String, Integer> students = new HashMap();

        students.put("Shreyas", 99);
        students.put("Pratik", 100);
        students.put("Kanaya", 87);
        students.put("aradhy", 98);
        students.put("Pratik", 100);

        System.out.println(students.keySet());

        for(String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}