@FunctionalInterface
interface A73 {
    void show(int i);
}

//class B72 implements A72 {
//    public void show() {
//        System.out.println("in Show");
//    }
//}

public class Hello73 {
    public static void main(String a[]) {
        A73 obj = i -> System.out.println("in Show " + i);
        obj.show(5);
    }
}