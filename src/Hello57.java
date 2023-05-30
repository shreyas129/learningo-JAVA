// final

// final class
final class Aahe { // we cannot extend classes from this
    // final method
    public final void show() { // we cannot override this
        System.out.println("in Aahe show");
    }

    public void add(int guy, int bye) {
        System.out.println(guy + bye);
    }
}

public class Hello57 {
    public static void main(String a[]) {
        // final variable
        final int num = 8;
        // num = 9; // this does not work
        System.out.println(num);

        // final class
        Aahe obj = new Aahe();
        obj.show();
        obj.add(4, 5);
    }
}