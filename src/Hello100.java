sealed class A100 extends Thread implements Cloneable permits B100, C100{

}

non-sealed class B100 extends A100 {

}

final class C100 extends A100 {

}

class D100 extends B100 {

}

sealed interface x permits y{

}

non-sealed interface y extends x {

}

public class Hello100 {
    public static void main(String a[]) {

    }
}