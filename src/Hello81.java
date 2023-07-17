class MyException extends Exception {
    public MyException(String string) {
        super(string);
    }
}

public class Hello81 {
    public static void main(String a[]) {
        int i = 0;
        int j = 0;

        try {
            if(j==0) {
                throw new MyException("/ by zero");
            }
        }
        catch( MyException e) {
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