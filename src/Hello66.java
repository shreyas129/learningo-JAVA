interface A66 {

    int age = 9;
    String area = "Pune";

    void show();
    void config();
}

class B66 implements A66 {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

public class Hello66 {
    public static void main(String a[]) {
        A66 obj;
        obj = new B66();
        obj.show();
        obj.config();

        System.out.println(A66.area);

    }
}
