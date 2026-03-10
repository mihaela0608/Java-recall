package ConditionalStatements;

import java.util.Scanner;

public class C6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int num = 1;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ", num);
                num++;
            }
            System.out.println();
        }
    }
}
