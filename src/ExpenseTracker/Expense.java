package ExpenseTracker;

import java.time.LocalDateTime;

public class Expense {
    private static int ID = 0;
    private int id;
    private double amount;
    private String category;
    private LocalDateTime date;

    public Expense(double amount, String category) {
        this.id = ++ID;
        this.amount = amount;
        this.category = category;
        this.date = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}
