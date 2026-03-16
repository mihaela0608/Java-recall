package Arrays;

import java.util.ArrayList;

public class A7 {
    static void main() {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(8);
        numbersList.add(5);
        numbersList.add(18);
        numbersList.add(68);
        numbersList.add(85);
        numbersList.add(-9);
        numbersList.add(-7);

        int[] numsArr = new int[numbersList.size()];
        for (int i = 0; i < numbersList.size(); i++) {
            numsArr[i] = numbersList.get(i);
        }

        for (int i = 0; i < numsArr.length; i++) {
            System.out.println(numsArr[i]);
        }
    }
}
