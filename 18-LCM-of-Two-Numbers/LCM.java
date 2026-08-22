import java.util.*;

public class LCM {

    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm ;
        int greatest = Math.max(a, b);
        for (int i = greatest ; ; i++ ){
            if (i % a == 0 && i % b == 0){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
        sc.close();
    }
}