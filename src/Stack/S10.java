package Stack;

import java.util.Stack;

public class S10 {
    static void main() {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(18);
        numbers.push(7);
        numbers.push(8);
        numbers.push(8);
        numbers.push(7);
        numbers.push(85);
        numbers.push(859);
        numbers.push(2);

        numbers = removeDuplicates(numbers);

        int size = numbers.size();

        for (int i = 0; i < size; i++) {
            System.out.println(numbers.pop());
        }
    }

    public static Stack<Integer> removeDuplicates(Stack<Integer> numbers){
        Stack<Integer> newStack = new Stack<>();
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            Stack<Integer> copyStack = copyStack(numbers);
            copyStack.pop();
            int num = numbers.pop();
            boolean isCopy = false;
            for (int j = i; j < size - 1; j++) {
                if (num == copyStack.pop()){
                    isCopy = true;
                }
            }
            if (!isCopy){
                newStack.push(num);
            }
        }
        return newStack;
    }
    public static Stack<Integer> copyStack(Stack<Integer> numbers){
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> copy = new Stack<>();

        while(!numbers.isEmpty()){
            temp.push(numbers.pop());
        }

        while(!temp.isEmpty()){
            int num = temp.pop();
            numbers.push(num);
            copy.push(num);
        }

        return copy;
    }
}
