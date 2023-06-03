class A62 {
    int age;

    public void show() {
        System.out.println("in show");
    }

    static class B62 {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class Hello62 {
    public static void main(String a[]) {
        A62 obj = new A62();
        obj.show();

        A62.B62 obj1 = new A62.B62();
        obj1.config();
    }
}