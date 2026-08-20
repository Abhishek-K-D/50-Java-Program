import java.util.*;

public class ArmstrongNumber {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10 ;
            int b = digit * digit * digit;
            sum += b;
            num/=10;
        }
        if(n == sum){
            System.out.println(n + " is a Armstrong number");
        }else{
            System.out.println(n + " is NOT a Armstrong number");
        }
        sc.close();
    }
}