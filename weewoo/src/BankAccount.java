public class BankAccount {

    public static final String bankName = "Liceo Bank";
    public static final double interestRate = 0.03;
    private static int totalAccounts = 0;
    private static int nextAccountNumber = 1;


    private final String accountNumber;
    private final String accountHolderName;
    private double balance;


    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountNumber = String.format("ACC%03d", nextAccountNumber++);
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    public double calculateInterest() {
        return Math.round(balance * interestRate * 100.0) / 100.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}