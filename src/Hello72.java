@FunctionalInterface
interface A72 {
    void show();
}

//class B72 implements A72 {
//    public void show() {
//        System.out.println("in Show");
//    }
//}

public class Hello72 {
    public static void main(String a[]) {
        A72 obj = new A72() {
            public void show() {
                System.out.println("in Show");
            }
        };
        obj.show();
    }
}