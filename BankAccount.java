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

    private void deposit(double amount) {
        balance += (amount > 0) ? amount : 0;
    }

    private void withdraw(double amount) {
        balance -= (amount >= balance) ? amount : 0;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    String displayAccountDetails(){
        return "Name: " + accountName + "\n"
                + "Number: " + accountNumber + "\n"
                + "Balance: " + balance;
    }
}
