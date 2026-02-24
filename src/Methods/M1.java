package Methods;

import java.util.Scanner;

public class M1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        System.out.println(biggestNum(a, b, c));
    }

    public static double biggestNum(double a, double b, double c) {
        double max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        return max;
    }
}
