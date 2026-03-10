package ConditionalStatements;

import java.util.Scanner;

public class C3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Integer month: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        int days = 0;
        if (month < 1 || month > 12){
            System.out.println("Invalid number!");
            return;
        }
        if(month == 2){
            if (year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        days = 29;
                    } else {
                        days = 28;
                    }
                } else {
                    days = 29;
                }
            }
        } else if (month % 2 == 0) {
            days = 30;
        } else {
            days = 31;
        }

        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };

        System.out.printf("%s %d had %d days", monthName, year, days);
    }
}
