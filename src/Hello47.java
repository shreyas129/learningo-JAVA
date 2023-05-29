class A22 {
    public A22() {
        System.out.println("object created!");
    }
    public void show() {
        System.out.println("in A show");
    }
}

public class Hello47 {
    public static void main(String a[]) {
        new A22().show(); // anonymous object
        new A22().show();
    }
}
