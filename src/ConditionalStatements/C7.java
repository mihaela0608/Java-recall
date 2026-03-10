package ConditionalStatements;

import java.util.Scanner;

public class C7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String[] rows = new String[count];
        for (int i = count-1; i >= 0; i--) {
            String row = "";
            for (int j = 0; j < count - i; j++) {
                row+=" ";
            }
            for (int j = 0; j < i; j++) {
                row+="* ";
            }

            rows[i] = row;
        }
        String middleRow = "";
        for (int i = 0; i < count; i++) {
            middleRow+="* ";
        }
        rows[count-1]=middleRow;
        String[] secondRows = new String[count - 1];
        int ind = 0;
        for (int i = count - 2; i >= 0; i--) {
            String row = "";
            for (int j = 1; j < count - i; j++) {
                row+=" ";
            }
            for (int j = 0; j <= i; j++) {
                row+="* ";
            }

            secondRows[ind] = row;
            ind++;
        }

        for (int i = 0; i < rows.length; i++) {
            System.out.println(rows[i]);
        }
        for (int i = 0; i < secondRows.length; i++) {
            System.out.println(secondRows[i]);
        }
    }
}
