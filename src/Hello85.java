class A85 extends Thread{
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B85 extends Thread{
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class Hello85 {
    public static void main(String a[]) {
        A85 obj1 = new A85();
        B85 obj2 = new B85();

        obj1.start();
        obj2.start();
    }
}