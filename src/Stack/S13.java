package Stack;

import java.util.Stack;

public class S13 {
    static void main() {
        Stack<Integer> nums1 = new Stack<>();
        Stack<Integer> nums2 = new Stack<>();

        nums1.push(5);
        nums1.push(15);
        nums1.push(7);
        nums1.push(8);

        nums2.push(5);
        nums2.push(15);
        nums2.push(7);

        System.out.println(areStacksEqual(nums1, nums2));
    }

    public static boolean areStacksEqual(Stack<Integer> stack1, Stack<Integer> stack2){
        if (stack1.size() != stack2.size()){
            return false;
        }
        int size = stack1.size();
        for (int i = 0; i < size; i++) {
            if (stack1.pop() != stack2.pop()){
                return false;
            }
        }
        return true;
    }
}
