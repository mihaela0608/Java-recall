package ConditionalStatements;

import java.util.ArrayList;
import java.util.Scanner;

public class C5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        ArrayList<String> rows = new ArrayList<>();
        for (int i = num; i >=  1; i--) {
            String row = "";
            for (int j = 0; j < num - i; j++) {
                row+=" ";
            }
            for (int j = 0; j < i; j++) {
                String forAppend = i + " ";
                row+=forAppend;
            }
            for (int j = 0; j < num - i; j++) {
                row+=" ";
            }
            rows.add(row);
        }
        for (int i = num-1; i >= 0; i--) {
            System.out.println(rows.get(i));
        }
    }
}
