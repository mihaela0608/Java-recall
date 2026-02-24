package Methods;

import java.util.Scanner;

public class M8 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Your deposit: ");
        double deposit = Double.parseDouble(scanner.nextLine());
        System.out.printf("For years:  ");
        int years = Integer.parseInt(scanner.nextLine());
        System.out.printf("With interest rate: : ");
        double rate = Double.parseDouble(scanner.nextLine());

        double result = moneyWithInterest(deposit, years, rate);
        System.out.printf("In the end of the %d years you will have: %.2f", years, result);
    }
    public static double moneyWithInterest(double deposit, int years, double interestRate){
        for(int i = 0; i < years; i++){
            deposit+= (deposit * (interestRate / 100));
        }
        return deposit;
    }
}
