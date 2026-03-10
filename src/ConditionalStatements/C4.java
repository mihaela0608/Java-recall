package ConditionalStatements;

import java.util.Scanner;

public class C4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
}
