package Stack;

import java.util.Scanner;
import java.util.Stack;

public class S5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(18);
        numbers.push(7);
        numbers.push(8);

        int num = Integer.parseInt(scanner.nextLine());
        numbers = removeGivenNumber(numbers, num);
        int size = numbers.size();

        for (int i = 0; i < size; i++) {
            System.out.println(numbers.pop());
        }
    }

    public static Stack<Integer> removeGivenNumber(Stack<Integer> numbers, int num){
        Stack<Integer> newStack = new Stack<>();
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            int lastNum = numbers.pop();
            if (lastNum != num){
                newStack.push(lastNum);
            }
        }
        return newStack;
    }
}
