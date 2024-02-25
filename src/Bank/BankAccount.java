package Bank;


		import java.util.*;

		class BankAccount {
		    private String accountNumber;
		    private String accountHolderName;
		    private double balance;

		    public BankAccount(String accountNumber, String accountHolderName) {
		        this.accountNumber = accountNumber;
		        this.accountHolderName = accountHolderName;
		        this.balance = 0.0;
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

		    public void setAccountHolderName(String accountHolderName) {
		        this.accountHolderName = accountHolderName;
		    }

		    public void deposit(double amount) {
		        balance += amount;
		        System.out.println("Deposited: $" + amount);
		    }

		    public void withdraw(double amount) {
		        if (balance >= amount) {
		            balance -= amount;
		            System.out.println("Withdrawn: $" + amount);
		        } else {
		            System.out.println("Insufficient funds");
		        }
		    }
		}

		