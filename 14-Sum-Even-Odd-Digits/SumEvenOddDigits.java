import java.util.*;

public class SumEvenOddDigits {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int even_sum = 0;
        int odd_sum = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit % 2 ==0){
                even_sum += digit;
            }
            else{
                odd_sum += digit;
            }num/=10;
        }
        System.out.println(even_sum);
        System.out.println(odd_sum);
        sc.close();
    }
}