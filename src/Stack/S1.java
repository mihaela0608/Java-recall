package Stack;

import java.util.Scanner;
import java.util.Stack;

public class S1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();

        for (int i = 0; i < 10; i++) {
            numbers.push(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers.pop());
        }


    }
}
