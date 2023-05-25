class Mobile2 {
    String Brand;
    int price;
    static String name;

    public void show() {
        System.out.println(Brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile2 obj) {
        System.out.println(obj.Brand + " : " + obj.price + " : " + name);
    }
}

public class Hello39 {
    public static void main(String a[]) throws ClassNotFoundException {
        Mobile2 obj1 = new Mobile2();
        obj1.Brand = "Apple";
        obj1.price = 2000;
        Mobile2.name = "SmartPhone";

        Mobile2 obj2 = new Mobile2();
        obj2.Brand = "Samsung";
        obj2.price = 1450;
        Mobile2.name = "SmartPhone";

        Mobile2.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile2.show1(obj1);
    }
}

