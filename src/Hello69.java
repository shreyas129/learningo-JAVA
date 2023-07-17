enum Status1 {
    Running, Failed, Pending, Success;
}

public class Hello69 {
    public static void main(String a[]) {
        Status1 s = Status1.Success;

        switch(s) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
            break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

        // if(s == Status1.Running) {
        //     System.out.println("All good");
        // } else if (s == Status1.Failed) {
        //     System.out.println("Try again");
        // } else if (s == Status1.Pending) {
        //     System.out.println("Please wait");
        // } else {
        //     System.out.println("Done");
        // }
    }
}
