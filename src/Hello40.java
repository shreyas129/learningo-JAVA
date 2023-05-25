import java.net.HttpURLConnection;

class Human {
    private int age;
    String name;
}

public class Hello40 {
    public static void main(String a[]) {
        Human obj = new Human();
        obj.age = 9;
        obj.name = "Shreyas";

        System.out.println(obj.name);
    }
}
