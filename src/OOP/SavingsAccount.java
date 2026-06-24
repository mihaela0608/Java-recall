package OOP;

public class SavingsAccount extends BankAccount{
    private double interest;
    public SavingsAccount(String accountNumber, String holdersName, double balance, double interest) {
        super(accountNumber, holdersName, balance);
        this.interest = interest;
    }

    public double applyInterest(){
        return getBalance() * (interest / 100) + getBalance();
    }
}
