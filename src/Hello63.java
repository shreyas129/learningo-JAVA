class A63 {
    public void show() {
        System.out.println("in A show");
    }
}

public class Hello63 {
    public static void main(String a[]) {
        A63 obj = new A63(){
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}