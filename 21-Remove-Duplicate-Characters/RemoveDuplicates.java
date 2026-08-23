import java.util.*;

public class RemoveDuplicates {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String result = ""; 

        for(int i = 0; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(!result.contains(String.valueOf(ch))){
                result += ch;
            }
        }
        System.out.println(result);
        sc.close();
    }
}