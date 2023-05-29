// this lecture was telling of a problem that this does not work
//
// class A11 {
//     //
// }
//
// class B {
//     //
// }
//
// class C extends A and B {
//
//  }

public class Hello51 {
    public static void main(String a[]) {
        Hello50VeryAdvCalc obj = new Hello50VeryAdvCalc();
        int sum = obj.add(4, 5);
        int num = obj.sub(7, 3);
        int rum = obj.multi(5, 3);
        int drum = obj.div(15, 4);
        double chat = obj.power(4, 2);

        System.out.println(sum + " " + num + " " + rum + " " + drum + " " + chat);
    }
}
