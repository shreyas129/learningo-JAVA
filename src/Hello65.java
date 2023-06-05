interface computer {
    void code();
}

class Laptop implements computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements computer {
    public void code() {
        System.out.println("code, compile, run : Faster");
    }
}

class Developer {
    public void devApp(computer comp) {
        comp.code();
    }
}

public class Hello65 {
    public static void main(String a[]) {
        computer lap = new Laptop();
        computer desk = new Desktop();
        Developer Shreyas = new Developer();
        Shreyas.devApp(desk);

    }
}
