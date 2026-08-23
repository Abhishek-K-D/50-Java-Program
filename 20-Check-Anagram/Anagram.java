import java.util.*;

public class Anagram {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isEqual = Arrays.equals(arr1, arr2);
        if(isEqual){
            System.out.println("Anagram");
        }else{
            System.out.println("NOT Anagram");
        }
        sc.close();
    }
}