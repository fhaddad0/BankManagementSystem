import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void signMenu(){
        System.out.println("Welcome to the Bank Management System");
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("""
                    Instructions for use:
                    --- 1: Create a new bank account
                    --- 2: Log in to bank account
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
                    System.out.println("Please enter your name: ");
                    name = input.next();
                    System.out.println("Please enter your account number: ");
                    int accountNumber = input.nextInt();

                    int index = accounts.indexOf(account.getAccountNumber());

                    if(index != -1){
                        menu();
                    } else {
                        System.out.println("These account details aren't in our system!");
                    }
                    break;
                case 0:
                    System.out.println("Thank you for using Bank Management System!");
                    break;

            }
                    break;

    }

    public static void menu(BankAccount account){
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
