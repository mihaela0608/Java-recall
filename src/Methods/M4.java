package Methods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class M4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int count = vowels(word);
        System.out.println(count);
    }
    public static int vowels(String word){
        String[] letters = word.split("");
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i].toLowerCase();
            if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") || letter.equals("y")){
                count++;
            }
        }
        return count;
    }
}
