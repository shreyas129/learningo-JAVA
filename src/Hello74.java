@FunctionalInterface
interface A74 {
    int add(int i, int j);
}

public class Hello74 {
    public static void main(String a[]) {
        A74 obj = (int i, int j) -> i + j;
        int result = obj.add(5, 4);
        System.out.println(result);
    }
}