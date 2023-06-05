interface A67 {

    // int age = 9;
    // String area = "Pune";

    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B67 implements A67, X {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("running..");
    }
}

public class Hello67 {
    public static void main(String a[]) {
        A67 obj;
        obj = new B67();
        obj.show();
        obj.config();

        X obj1 = new B67();
        obj1.run();

        // System.out.println(A66.area);

    }
}
