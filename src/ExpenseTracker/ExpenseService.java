package ExpenseTracker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpenseService {
    private List<Expense> expenses;

    public ExpenseService() {
        this.expenses = new ArrayList<>();
    }


    public void addExpense(Expense expense){
        expenses.add(expense);
    }

    public List<Expense> getAllExpenses(){
        return this.expenses;
    }

    public void deleteById(int id){
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getId() == id){
                expenses.remove(i);
                break;
            }
        }
    }

    public List<Expense> getByCategory(String category){
        List<Expense> newList = new ArrayList<>();
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getCategory().equals(category)){
                newList.add(expenses.get(i));
            }
        }
        return newList;
    }

    public double getTotalExpenses(){
        double sum = 0;
        for (int i = 0; i < expenses.size(); i++) {
            sum+=expenses.get(i).getAmount();
        }
        return sum;
    }
    public Expense getMostExpensiveExpense(){
        double maxAmount = expenses.get(0).getAmount();
        int maxInd = 0;
        for (int i = 1; i < expenses.size(); i++) {
            if (maxAmount < expenses.get(i).getAmount()){
                maxAmount = expenses.get(i).getAmount();
                maxInd = i;
            }
        }
        return expenses.get(maxInd);
    }
}
