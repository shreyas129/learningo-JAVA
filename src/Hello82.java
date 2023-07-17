class A82 {
    public void show() throws ClassNotFoundException {
                Class.forName("calc");
    }
}

public class Hello82 {
    static {
        System.out.println("Class loaded");
    }

    public static void main(String a[]) {
        A82 obj = new A82();
        try {
            obj.show();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}