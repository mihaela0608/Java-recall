package Stack;

import java.util.Stack;

public class S4 {
    static void main() {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(18);
        numbers.push(7);
        numbers.push(8);

        System.out.printf("Top is: %d\n", topElement(numbers));
        System.out.printf("Bottom is: %d\n", bottomElement(numbers));
    }

    public static int bottomElement(Stack<Integer> numbers){
        int size = numbers.size();
        for (int i = 0; i < size - 1; i++) {
            numbers.pop();
        }
        return numbers.pop();
    }
    public static int topElement(Stack<Integer> numbers){
        return numbers.pop();
    }
}
