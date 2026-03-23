package Stack;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Stack;

public class S14 {
    static void main() {
        Stack<Integer> nums1 = new Stack<>();
        Stack<Integer> nums2 = new Stack<>();

        nums1.push(5);
        nums1.push(15);
        nums1.push(7);
        nums1.push(8);

        nums2.push(12);
        nums2.push(5);
        nums2.push(8);
        nums2.push(7);

        ArrayList<Integer> commonNumbers = commonElements(nums1, nums2);
        for (int i = 0; i < commonNumbers.size(); i++) {
            System.out.println(commonNumbers.get(i));
        }
    }

    public static ArrayList<Integer> commonElements(Stack<Integer> s1, Stack<Integer> s2){
        ArrayList<Integer> commonNumbers = new ArrayList<>();
        int size1 = s1.size();
        int[] nums1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            nums1[i] = s1.pop();
        }
        int size2 = s2.size();
        for (int i = 0; i < size2; i++) {
            int num = s2.pop();
            for (int j = 0; j < size1; j++) {
                if (num == nums1[j]){
                    commonNumbers.add(num);
                }
            }
        }
        return commonNumbers;
    }


}
