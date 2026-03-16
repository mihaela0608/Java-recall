package Arrays;

public class A9 {
    static void main() {
        int[] nums = {8, 0,96, 3, 4, 0, 12, 0, 85, 0, 74, 280, 3, 6, 0, 6, 5, 7};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
