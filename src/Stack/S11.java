package Stack;

import java.util.Stack;

public class S11 {
    static void main() {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(18);
        numbers.push(7);
        numbers.push(8);

        System.out.println(nthElFromTop(numbers, 2));
        System.out.println(nthFromBottom(numbers, 2));
    }

    public static int nthElFromTop(Stack<Integer> nums, int n){
        for (int i = 0; i < n - 1; i++) {
            nums.pop();
        }
        return nums.pop();
    }

    public static int nthFromBottom(Stack<Integer> nums, int n){
        Stack<Integer> newStack = new Stack<>();
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            newStack.push(nums.pop());
        }
        for (int i = 0; i < n - 1; i++) {
            newStack.pop();
        }
        return newStack.pop();

    }
}
