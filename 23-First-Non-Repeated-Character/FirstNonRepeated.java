import java.util.*;

public class FirstNonRepeated {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String processed = "" ;
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(!processed.contains(String.valueOf(ch))){
                int count = 0;
                for(int j = 0 ; j < str.length() ; j++){
                    if(str.charAt(j)==ch){
                        count++ ;
                    }
                }
                if(count==1){
                    System.out.println(ch + " = " + count);
                    break;
                }
            }
        }
        sc.close();
    }
}