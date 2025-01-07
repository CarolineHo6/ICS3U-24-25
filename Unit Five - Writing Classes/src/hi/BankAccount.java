package hi;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void getBalance() {
        System.out.println(balance);
    }

    public class Main {
        public static void main(String[] args) {
            BankAccount adriana = new BankAccount(1000000, "123456789");
            adriana.deposit(10000000);
            adriana.withdraw(10);
            adriana.getBalance();
        }
    }
}
