class Human4 {
    private int age;
    private String name;

    public Human4() { // Default Constructor
        age = 9;
        name = "Shreyas";
    }

    public Human4(int age, String name) { // Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    public Human4(String name) {
        this.age = 0;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Hello44 {
    public static void main(String a[]) {
        Human4 obj = new Human4();
        Human4 obj1 = new Human4(999, "jugender");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

        obj.setAge(43);
        obj.setName("Prashant");

         System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
