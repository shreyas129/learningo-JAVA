public class Hello80 {
    public static void main(String a[]) {
        int i = 0;
        int j = 0;

        try {
            j = 18/i;
            if(j==0) {
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e) {
            j = 18/1;
            System.out.println("That's the default output : " + e);
        }

        catch(Exception e) {
            System.out.println("Something went wrong.. : " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}