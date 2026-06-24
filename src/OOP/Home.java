package OOP;

public class Home {
    static void main() {
        BankAccount bankAccount = new BankAccount("A78D", "Iva", 800);
        bankAccount.depositMoney(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawMoney(400);
        System.out.println(bankAccount.getBalance());
    }
}
