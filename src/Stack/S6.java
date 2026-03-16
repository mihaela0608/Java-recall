package Stack;

import java.util.Stack;

public class S6 {
    static void main() {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(18);
        numbers.push(7);
        numbers.push(8);

        numbers = swapTop2(numbers);

        int size = numbers.size();

        for (int i = 0; i < size; i++) {
            System.out.println(numbers.pop());
        }
    }

    public static Stack<Integer> swapTop2(Stack<Integer> numbers){
        int num1 = numbers.pop();
        int num2 = numbers.pop();

        numbers.push(num1);
        numbers.push(num2);
        return numbers;
    }
}
