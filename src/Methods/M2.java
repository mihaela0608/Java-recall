package Methods;

import java.util.Scanner;

public class M2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double average = average(a, b, c);
        System.out.println(average);
    }
    public static double average(double a, double b, double c){
        double sum = a + b +c;
        return sum / 3;
    }
}
