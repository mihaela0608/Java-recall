package Methods;

import java.util.Scanner;

public class M3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(middleCharacter(text));
    }
    public static String middleCharacter(String word){
        int position;
        int length;
        if(word.length() % 2 == 0) {
            position = word.length() / 2 -1;
            length = 2;
        } else {
            position = word.length() / 2;
            length = 1;
        }
        return word.substring(position, position + length);
    }
}
