import java.util.*;

public class PrimeNumbersRange {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Initial Range: ");
        int initial = sc.nextInt() ;
        System.out.print("Enter an Final Range: ");
        int end = sc.nextInt();
        for (int num = initial ; num < end ; num++){
            int count = 0;
            for (int i = 2 ; i * i <= num ; i++){
                if (num % i == 0){
                    count ++;
                }
            }
            if(count == 0 && num > 1){
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
        