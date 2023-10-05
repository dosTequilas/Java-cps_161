package bank;

public class CheckingAccount extends Account {
	private double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > getBalance() + overdraftLimit) {
			System.out.println("Transaction rejected: Overdraft limit exceeded." + "\n");
		} else {
			setBalance(getBalance() - amount);
			System.out.println("Current balance: $" + String.format("%.2f", getBalance()) + "\n");
		}
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Current balance: $" + String.format("%.2f", getBalance()) + "\n");
	}

	@Override
	public String toString() {
	    return "Checking Account\n" +
	           "Account No: " + getAccountNumber() + "\n" +
	           "Account Balance: $" + String.format("%.2f", getBalance()) + "\n" +
	           "Date Created: " + getDateCreated() + "\n" +
	           "Overdraft Limit: $" + String.format("%.2f", getOverdraftLimit()) + "\n";
	}
}
