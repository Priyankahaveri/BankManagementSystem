package Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankManagementSystem {
    private static Map<String, BankAccount> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Update Account");
            System.out.println("4. Delete Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    viewAccount();
                    break;
                case 3:
                    updateAccount();
                    break;
                case 4:
                    deleteAccount();
                    break;
                case 5:
                    System.out.println("Thank you for using our services!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void createAccount() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, accountHolderName);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully!");
    }

    private static void viewAccount() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    private static void updateAccount() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.print("Enter New Account Holder Name: ");
            String newAccountHolderName = scanner.nextLine();
            account.setAccountHolderName(newAccountHolderName);
            System.out.println("Account updated successfully!");
        } else {
            System.out.println("Account not found!");
        }
    }

    private static void deleteAccount() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            accounts.remove(accountNumber);
            System.out.println("Account deleted successfully!");
        } else {
            System.out.println("Account not found!");
        }
    }



}



