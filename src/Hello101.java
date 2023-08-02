import java.util.Objects;

// class Alien {
//     private final int id;
//     private final String name;
//
//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
//
//     public int getId() {
//         return id;
//     }
//
//     public String getName() {
//         return name;
//     }
//
//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (!(o instanceof Alien alien)) return false;
//         return getId() == alien.getId() && Objects.equals(getName(), alien.getName());
//     }
//
//     @Override
//     public int hashCode() {
//         return Objects.hash(getId(), getName());
//     }
//
//     public String toString() {
//         return getName() + " : " + getId();
//     }
// }

record Alien(int id, String name) {}

public class Hello101 {
    public static void main(String a[]) {
        Alien a1 = new Alien(1, "Shreyas");
        Alien a2 = new Alien(1, "Shreyas");

        System.out.println(a1.equals(a2));
        System.out.println(a1);
    }
}