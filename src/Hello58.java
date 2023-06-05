import java.util.Objects;

class Laptop1 {
    String model;
    int price;
    String serail;

    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' + ", price=" + price + '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop1 laptop)) {
            return false;
        }
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class Hello58 {
    public static void main(String a[]) {
        Laptop1

        obj1 = new Laptop1();
        obj1.model = "Asus Windows 10 pro";
        obj1.price = 16000;

        System.out.println(obj1);
        Laptop1

        obj11 = new Laptop1();
        obj11.model = "Asus Windows 10 pro";
        obj11.price = 16000;

        Laptop1

        obj2 = new Laptop1();
        obj2.model = "Asus Windows 10 pro";
        obj2.price = 16000;

        boolean result = obj11.equals(obj2);

        System.out.println(result);
    }
}