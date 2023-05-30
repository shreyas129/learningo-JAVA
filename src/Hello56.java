class A111 {
    public void show() {
        System.out.println("in A show");
    }
}

class B111 extends A111 {
    public void show() {
        System.out.println("in B show");
    }
}

class C111 extends A111 {
    public void show() {
        System.out.println("in C show");
    }
}

public class Hello56 {
    public static void main(String a[]) {
        A111 obj = new A111();
        obj.show();

        obj = new B111();
        obj.show();

        obj = new C111();
        obj.show();
   }
}
