import java.util.*;

public class MostRepeatingCharacter {

    static String findMostRepeatingCharacter(String s) {

        int max = 0;
        char result = ' ';

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == current)
                    count++;
            }

            if (count > max) {
                max = count;
                result = current;
            }
        }
        /*return String.valueOf(result)*/
        return result + " " + max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(findMostRepeatingCharacter(s));

        sc.close();
    }
}