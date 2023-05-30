class Ab4356789 {
    public void show1() {
        System.out.println("in A show ");
    }
}

class B1435et6ru7891 extends Ab4356789 {
    public void show2() {
        System.out.println("in B show ");
    }
}

public class Hello59 {
    public static void main(String a[]) {
        Ab4356789 obj = (Ab4356789) new B1435et6ru7891();
        obj.show1();

        B1435et6ru7891 obj1 = (B1435et6ru7891) obj;
        obj1.show2();
    }
}
