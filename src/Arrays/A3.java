package Arrays;

public class A3 {
    static void main() {
        int[] nums = {5, 8, 94, 75, 280, -30};
        for (int i = 0; i < nums.length / 2; i++) {
            int num = nums[i];
            System.out.println(nums[nums.length - i -1]);
            nums[i] = nums[nums.length - i -1];
            nums[nums.length -i -1] = num;
        }
        for (int i = 0; i <  nums.length; i++) {
            System.out.printf("%d", nums[i]);
        }
    }
}
