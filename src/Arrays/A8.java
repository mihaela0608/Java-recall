package Arrays;

public class A8 {
    static void main() {
        int[] nums = {8, 96, 3, 4, 12, 0, 85, 74, 280, 3, 6, 6, 5, 7};
        int sum = 12;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum){
                    System.out.printf("%d + %d = %d\n", nums[i], nums[j], sum);
                }
            }
        }
    }
}
