package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class AL1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            colors.add(scanner.nextLine());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(colors.get(i));
        }
    }
}
