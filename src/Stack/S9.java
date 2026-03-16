package Stack;

import java.util.Stack;

public class S9 {
    static void main() {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(18);
        numbers.push(7);
        numbers.push(8);

        System.out.println(maxElement(copyStack(numbers)));
        System.out.println(minElement(copyStack(numbers)));
    }

    public static int minElement(Stack<Integer> nums){

        int min = nums.pop();
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            int num = nums.pop();
            if (num < min){
                min = num;
            }
        }
        return min;
    }
    public static int maxElement(Stack<Integer> nums){
        int max = nums.pop();
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            int num = nums.pop();
            if (num > max){
                max = num;
            }
        }
        return max;
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
