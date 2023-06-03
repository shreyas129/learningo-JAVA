abstract class Car {
    public abstract void drive();
    public abstract void fly();
    public void playMusic() {
        System.out.println("play music");
    }
}

 abstract class Altroz extends Car {
    public void drive() {
        System.out.println("Driving");
    }
}

class UptAltroz extends Altroz {
    public void fly() {
        System.out.println("Fliying..");
    }
}

public class Hello61 {
    public static void main(String a[]) {
        Car obj = new UptAltroz();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
