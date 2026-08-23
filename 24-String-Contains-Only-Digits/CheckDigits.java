import java.util.*;

public class CheckDigits {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        boolean isDigits = true;
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9'){
                isDigits = false;
                break;
            }
        }
        if(isDigits){
            System.out.println("Only digits");
        }else{
            System.out.println("NOT Only digits");
        }
        sc.close();
    }
}