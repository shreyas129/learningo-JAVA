import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pupil{
    int age;
    String name;

    public Pupil(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "pupil [age=" + age + ", name=" + name + ']';
    }
}

public class Hello94 {
    public static void main(String a[]) {

        Comparator<Pupil> com = (i, j) -> i.age > j.age ? 1 : - 1;

        List<Pupil> studs = new ArrayList<>();
        studs.add(new Pupil(9, "Shreyas"));
        studs.add(new Pupil(10, "Pratik"));
        studs.add(new Pupil(8, "Kanaya"));
        studs.add(new Pupil(12, "Aradhy"));

         Collections.sort(studs, com);

        for(Pupil s : studs) {
            System.out.println(s);
        }
    }
}