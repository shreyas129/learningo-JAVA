class calc {
    public int add(int num, int number) {
        return num + number;
    }
    //    public void config () {
    //     System.out.println("in A Config");
    // }
}

class Advclac extends calc {
     public int add(int num, int number) {
         return num + number + 1;
     }
}

public class Hello52 {
    public static void main(String a[]) {
        Advclac obj = new Advclac();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}