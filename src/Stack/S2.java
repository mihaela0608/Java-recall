package Stack;

import java.util.Stack;

public class S2 {
    static void main() {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(42);
        numbers.push(64);
        numbers.push(-8);
        numbers.push(6);

        numbers = reverseStack(numbers);
        int size = numbers.size();

        for (int i = 0; i < size; i++) {
            System.out.println(numbers.pop());
        }
    }

    public static Stack<Integer> reverseStack(Stack<Integer> numbers){
        Stack<Integer> newStack = new Stack<>();
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            newStack.push(numbers.pop());
        }
        return newStack;
    }
}
