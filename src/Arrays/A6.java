package Arrays;

import java.util.ArrayList;

public class A6 {
    static void main() {
        int[] nums = {5, 94, 8, 75, 94, 75, 280, 8, -30};
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            numbersList.add(nums[i]);
        }

        for (int i = 0; i < numbersList.size(); i++) {
            System.out.println(numbersList.get(i));
        }
    }
}
