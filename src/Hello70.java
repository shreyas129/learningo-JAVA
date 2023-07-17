enum ProLaptop {
    Macbook(9500), Linux, Windows(2300), Ubantu(120);

    private ProLaptop() {
        price = 20;
    }

    private int price;

    ProLaptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Hello70 {
    public static void main(String a[]) {
        // ProLaptop lap = ProLaptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for(ProLaptop laptop : ProLaptop.values()) {
            System.out.println(laptop+ " : " + laptop.getPrice());
        }
    }
}
