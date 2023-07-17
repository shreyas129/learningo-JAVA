class A86 extends Thread{
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            }

            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B86 extends Thread{
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Hello86 {
    public static void main(String a[]) {
        A86 obj1 = new A86();
        B86 obj2 = new B86();

        obj1.start();

        try {
            Thread.sleep(5);
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start();
    }
}