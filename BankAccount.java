public class BankAccount {

    private String accountName;
    private int accountNumber;
    private double balance;

    private int accountIncrementer = 100;

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountIncrementer++;
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
