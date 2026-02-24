package Methods;

import java.util.Scanner;

public class M9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        printChars(a, b);
    }
    public static void printChars(char start, char end){
        int count = 0;
        for(char ch = start; ch <= end; ch++){
            System.out.printf(ch + " ");
            count++;
            if (count % 20 == 0){
                System.out.println();
            }
        }
    }
}
