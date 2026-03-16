package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            numbers[i] = num;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}
