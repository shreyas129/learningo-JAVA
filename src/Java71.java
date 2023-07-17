class A71 {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A show");
    }
}

class B71 extends A71 {
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}

public class Java71 {
    public static void main(String a[]) {
        B71 obj = new B71();
        obj.showTheDataWhichBelongsToThisClass();
    }
}