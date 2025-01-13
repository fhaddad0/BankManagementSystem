public class BankAccount {

    private String accountName;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountName, int accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += (amount > 0) ? amount : 0;
    }

    public void withdraw(double amount) {
        balance -= (amount >= balance) ? amount : 0;
    }

    public String displayAccountDetails(){
        return "Name: " + accountName + "\n"
                + "Number: " + accountNumber + "\n"
                + "Balance: " + balance;
    }
}
