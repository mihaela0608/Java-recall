package Stack;

import java.util.Stack;

public class S12 {
    static void main() {
        Stack<Integer> nums1 = new Stack<>();
        Stack<Integer> nums2 = new Stack<>();

        nums1.push(5);
        nums1.push(15);
        nums1.push(7);
        nums1.push(8);

        nums2.push(12);
        nums2.push(5);
        nums2.push(78);
        nums2.push(9);

        for (int mergeStack : mergeStacks(nums1, nums2)) {
            System.out.println(mergeStack);
        }

    }

    public static Stack<Integer> mergeStacks(Stack<Integer> nums1, Stack<Integer> nums2){
        Stack<Integer> merged = new Stack<>();
        int size = nums1.size();
        for (int i = 0; i < size; i++) {
            merged.push(nums1.pop());
            merged.push(nums2.pop());
        }
        return merged;
    }
}
