class Mobile {
    String Brand;
    int price;
    static String name;
    public void show() {
        System.out.println(Brand + " : " + price + " : " + name);
    }
}

public class Hello37 {
    public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.Brand = "Apple";
        obj1.price = 2000;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Samsung";
        obj2.price = 1450;
        Mobile.name = "SmartPhone";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
