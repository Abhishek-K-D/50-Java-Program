import java.util.*;

public class SumOfDigits {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num /= 10;
        }
        System.out.print(sum);
        sc.close();
    }
}