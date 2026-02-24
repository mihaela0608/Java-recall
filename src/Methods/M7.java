package Methods;

import java.util.Scanner;

public class M7 {
    static void main() {
        pentagonNumbers();
    }
    public static void pentagonNumbers(){
        for (int i = 1; i <= 50; i++) {
            int num = (i * (3 * i - 1)) / 2;
            System.out.println(num);
        }
    }
}
