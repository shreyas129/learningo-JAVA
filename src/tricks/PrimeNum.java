package tricks;

public class PrimeNum {
    public static void main(String[] args) {
        for(int i = 1; i < 99999; i++) {
            for(int j = 1; j <= i; j++) {
                if(i == j) {
                    System.out.println(i);
                } else if(j == 1) {
                    continue;
                } else if (i % j == 0) {
                    break;
                }
            }
        }
    }
}

