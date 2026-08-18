import java.util.*;

public class StringPalindrome {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String original = sc.nextLine();
        String reverse = "";
        for (int i = original.length() - 1 ; i >= 0 ; i--){
            reverse += original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
        sc.close();
    }
}