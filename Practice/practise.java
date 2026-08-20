import java.util.*;
public class practise {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++ ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            int power = 1;
            for(int j = 0 ; j < n ; j++ ){
                sum = sum + power * b;
                System.out.print(sum + " ");
                power *= 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
