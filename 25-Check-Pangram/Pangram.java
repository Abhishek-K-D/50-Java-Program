import java.util.*;

public class Pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toLowerCase();
        boolean isPangram = true;
        for (char ch = 'a'; ch <= 'z' ; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("Pangram");
        } else {
            System.out.println("NOT Pangram");
        }
        sc.close();
    }
}