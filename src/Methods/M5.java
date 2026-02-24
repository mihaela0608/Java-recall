package Methods;

import java.util.Scanner;

public class M5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = countWords(text);
        System.out.printf("The words in text are: %d", count);
    }
    public static int countWords(String text){
        String[] words = text.split(" ");
        return words.length;
    }
}
