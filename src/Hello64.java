abstract class A64 {
    public abstract void show();
    public abstract void config();
}

public class Hello64 {
    public static void main(String a[]) {
        A64 obj = new A64() {
            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in config");
            }
        };
        obj.show();
    }
}