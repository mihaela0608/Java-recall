package OOP;

public class BankAccount {
    private String accountNumber;
    private String holdersName;
    private double balance;

    public BankAccount(String accountNumber, String holdersName, double balance) {
        this.accountNumber = accountNumber;
        this.holdersName = holdersName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean depositMoney(double deposit){
        if (deposit <= 0){
            return false;
        }
        this.balance+=deposit;
        return true;
    }
    public boolean withdrawMoney(double withdraw){
        if (withdraw <= 0 || this.balance < withdraw){
            return false;
        }
        this.balance-=withdraw;
        return true;
    }
}
