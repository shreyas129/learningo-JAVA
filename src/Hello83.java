import java.io.IOException;
import java.util.Scanner;

public class Hello83 {
    public static void main(String a[]) throws IOException {
        System.out.println("Enter a number");
        // int num = System.in.read();

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
    }
}