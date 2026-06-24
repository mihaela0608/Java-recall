package ExpenseTracker;

import java.util.Scanner;

public class Menu {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        ExpenseService expenseService = new ExpenseService();
        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            switch (command){
                case "Add expense":
                    double amount = Double.parseDouble(scanner.nextLine());
                    String category = scanner.nextLine();
                    Expense expense = new Expense(amount, category);
                    expenseService.addExpense(expense);
                    break;
                case "Show all expenses":
                    for (Expense expens : expenseService.getAllExpenses()) {
                        System.out.printf("%s: %.2f\n", expens.getCategory(), expens.getAmount());
                    }
                    break;
                case "Delete expense by id":
                    int id = Integer.parseInt(scanner.nextLine());
                    expenseService.deleteById(id);
                    break;
                case "Filter by category":
                    String ctg = scanner.nextLine();
                    for (Expense exp : expenseService.getByCategory(ctg)) {
                        System.out.printf("%s: %.2f\n", exp.getCategory(), exp.getAmount());
                    }
                    break;
                case "Show total expenses":
                    System.out.println(expenseService.getTotalExpenses());
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
