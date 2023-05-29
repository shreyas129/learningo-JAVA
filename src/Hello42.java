class Human2 {
    private int age = 9;
    private String name = "Shreyas";

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

public class Hello42 {
    public static void main(String a[]) {
        Human2 obj = new Human2();
        obj.setAge(43);
        obj.setName("Prashant");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
