import java.util.*;

public class NthFibonacci {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first_element = 0;
        int second_element = 1;
        int next = 0;
        if(n==0){
            System.out.println(0);
        }else if(n==1){
            System.out.println(1);
        }else{
            for (int i = 1 ; i < n ; i++){
                next = first_element + second_element;
                first_element = second_element;
                second_element = next;
            }
            System.out.print(next);
        }
        sc.close();
    }
}