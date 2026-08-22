import java.util.*;

public class GCD {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 0;
        int smallest = Math.min(a, b);
        for(int i = 1 ; i <= smallest ; i++){
            if(a % i == 0 && b % i == 0 ){
                gcd = i ;
            }
        }
        System.out.println(gcd);
        sc.close();
    }
}