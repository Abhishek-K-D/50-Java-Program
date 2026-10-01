import java.util.*;

public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (int i = 0; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}