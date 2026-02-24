package Methods;

import java.util.Scanner;

public class M6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println(sumOfDigits(number));

    }
    public static int sumOfDigits(String number){
        String[] nums = number.split("");
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            sum+=num;
        }
        return sum;
    }

}
