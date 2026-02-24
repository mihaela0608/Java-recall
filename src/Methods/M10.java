package Methods;

import java.util.Scanner;

public class M10 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }
    public static void printMatrix(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.printf("n" + " ");
            }
            System.out.println();
        }
    }
}
