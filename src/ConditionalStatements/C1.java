package ConditionalStatements;

public class C1 {
    static void main() {
        int lastNum = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d", ++lastNum);
            }
            System.out.println();
        }
    }
}
