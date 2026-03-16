package Stack;

import java.util.Collections;
import java.util.Stack;

public class S8 {
    static void main() {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(18);
        numbers.push(7);
        numbers.push(8);

        numbers = sortStack(numbers);

        int size = numbers.size();

        for (int i = 0; i < size; i++) {
            System.out.println(numbers.pop());
        }
    }

    public static Stack<Integer> sortStack(Stack<Integer> nums){
        Collections.sort(nums, Collections.reverseOrder());
        return nums;
    }
}
