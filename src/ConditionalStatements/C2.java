package ConditionalStatements;

import java.util.Scanner;

public class C2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double first = Math.round(Double.parseDouble(scanner.nextLine()) * 1000) / 3;
        double second = Math.round(Double.parseDouble(scanner.nextLine()) * 1000) / 3;

        if(first == second){
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are different");
        }


    }
}
