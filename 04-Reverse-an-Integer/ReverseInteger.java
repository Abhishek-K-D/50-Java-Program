import java.util.*;

public class ReverseInteger {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        int reverse = 0; 
        while (num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }System.out.println(reverse);
        sc.close();
    }
}