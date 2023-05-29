class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int number) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int num) {
        this();
        System.out.println("in B int");
    }
}

public class Hello45 {
    public static void main(String a[]) {
        B obj = new B(5);
    }
}
