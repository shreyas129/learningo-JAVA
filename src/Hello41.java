class Human1 {
    private int age = 9;
    private String name = "Shreyas";

    public int getAge() {
        return age;
    }

    public void setAge(int analyses) {
        age = analyses;
    }

    public void setName(String num) {
        name = num;
    }

    public String getName() {
        return name;
    }
}

public class Hello41 {
    public static void main(String a[]) {
        Human1 obj = new Human1();
        obj.setAge(43);
        obj.setName("Prashant");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
