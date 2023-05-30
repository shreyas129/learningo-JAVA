class A1 {
    public void show() {
        System.out.println("in A show");
    }
       public void config () {
        System.out.println("in A Config");
    }
}

class B1 extends A1 {
    public void show() {
        System.out.println("in B show");
    }
}

public class Hello52 {
    public static void main(String a[]) {
        B1 obj = new B1();
        obj.show();
        obj.config();
    }
}