abstract class Car {
    public abstract void drive();
    public void playMusic() {
        System.out.println("play music");
    }
}

class Altroz extends Car {
    public void drive() {
        System.out.println("Driving");
    }
}

public class Hello61 {
    public static void main(String a[]) {
        Car obj = new Altroz();
        obj.drive();
        obj.playMusic();
    }
}
