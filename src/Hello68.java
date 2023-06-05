enum Status {
    Running, Failed, Pending, Success;
}

public class Hello68 {
    public static void main(String a[]) {
        int i = 5;
        Status[] Ss = Status.values();

        for(Status s : Ss) {
            System.out.println(s + " : " +s.ordinal());
        }

    }
}
