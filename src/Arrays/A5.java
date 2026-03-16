package Arrays;

public class A5 {
    static void main() {
        int[] nums = {5, 94, 8, 75, 94, 75, 280, 8, -30};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    System.out.printf("%d\n", nums[i]);
                }
            }
        }

    }
}
