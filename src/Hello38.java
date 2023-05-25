class Mobile1 {
    String Brand;
    int price;
    static String name;
    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile1() {
        Brand = "";
        price = 200;
        System.out.println("in constructor");
    }
    public void show() {
        System.out.println(Brand + " : " + price + " : " + name);
    }
}

public class Hello38 {
    public static void main(String a[]) throws ClassNotFoundException {

        Class.forName("Mobile1");

        // Mobile1 obj1 = new Mobile1();
        // obj1.Brand = "Apple";
        // obj1.price = 2000;
        // Mobile1.name = "SmartPhone";

        // Mobile1 obj2 = new Mobile1();

        // obj1.show();
    }
}

