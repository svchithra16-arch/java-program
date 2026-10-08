package ternaryoperator;


	public class Bank {

	    private double amount;

	    public Bank(double amount) {
	        this.amount = amount;
	    }

	    public void withdraw(double withdrawalAmount) {

	        if (withdrawalAmount <= amount) {
	            amount -= withdrawalAmount;

	            System.out.println("Withdrawal successful");
	            System.out.println("Remaining balance: ₹" + amount);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    public void deposit(double depositAmount) {

	        amount += depositAmount;

	        System.out.println("Deposit successful");
	        System.out.println("Updated balance: ₹" + amount);
	    }

	    public static void main(String[] args) {

	        Bank bankAccount = new Bank(10000);

	        System.out.println("Initial balance: ₹" + bankAccount.amount);

	        bankAccount.withdraw(5000);

	        bankAccount.deposit(5000);
	    }
	}

