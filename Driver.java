import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void menu(){
        System.out.println("Welcome to the Bank Management System");
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("""
                    Instructions for use:
                    --- 1: Create a new bank account
                    --- 2: Deposit money
                    --- 3: Withdraw money
                    --- 4: View account details
                    --- 0: Exit Menu
                    
                    Please enter an option: """);

            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Please enter your name: ");
                    String name = input.next();
                    System.out.println("Please enter your current balance: ");
                    double balance = input.nextDouble();

                    BankAccount account = new BankAccount(name, balance);
                    accounts.add(account);

                    System.out.println("Your account has been created.\n" +
                            "Your account number is " + account.getAccountNumber() + "\n" +
                            "**Please Remember this number**");
                    break;
                case 2:
                    

            }
        }
    }
}
