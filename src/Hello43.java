class Human3 {
    private int age;
    private String name;

    public Human3() {
        age = 9;
        name = "Shreyas";
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

public class Hello43 {
    public static void main(String a[]) {
        Human3 obj = new Human3();

        System.out.println(obj.getName() + " : " + obj.getAge());

        obj.setAge(43);
        obj.setName("Prashant");

        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
