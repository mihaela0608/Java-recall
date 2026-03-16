package Stack;

import java.util.Scanner;
import java.util.Stack;

public class S3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(18);
        numbers.push(7);
        numbers.push(8);

        int num = Integer.parseInt(scanner.nextLine());
        if (checkIfPresent(numbers, num)){
            System.out.println("Number is in the stack");
        } else{
            System.out.println("Number is not present");
        }
    }

    public static boolean checkIfPresent(Stack<Integer> numbers, int num){
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            if (numbers.pop() == num){
                return true;
            }
        }
        return false;
    }
}
