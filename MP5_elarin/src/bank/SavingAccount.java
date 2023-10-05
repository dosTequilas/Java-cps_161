package bank;

public class SavingAccount extends Account {
    private static final double ANNUAL_INTEREST_RATE = 0.02; // 2%
    private String interestRateFormatted = String.format("%.2f", ANNUAL_INTEREST_RATE * 100);
    private double minDeposit;
    private static final double MONTHLY_FEE = 10.0;

    public SavingAccount(String accountNumber, double balance, double minDeposit) {
        super(accountNumber, balance);
        this.minDeposit = minDeposit;
    }

    public double getMinDeposit() {
        return minDeposit;
    }

    public void setMinDeposit(double minDeposit) {
        this.minDeposit = minDeposit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Transaction rejected: Insufficient balance." + "\n");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Current balance: $" + getBalance() + "\n") ;
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount < minDeposit) {
            System.out.println("Transaction rejected: Deposit amount is less than minimum required." + "\n");
        } else {
            setBalance(getBalance() + amount);
            System.out.println("Current balance: $" + getBalance() + "\n");
        }
    }

    @Override
    public String toString() {
        double interest = getBalance() * ANNUAL_INTEREST_RATE / 12;
        double newBalance = getBalance() - interest - MONTHLY_FEE;

        setBalance(newBalance);

        return "Saving Account\n" +
               "Account No: " + getAccountNumber() + "\n" +
               "Account Balance: $" + String.format("%.2f", getBalance()) + "\n" +
               "Date Created: " + getDateCreated() + "\n" +
               "Annual Interest Rate: " + interestRateFormatted + "%" +
               "\nMonthly Fee: $" + String.format("%.2f", MONTHLY_FEE) +
               "\nMinimum Deposit Amount: $" + String.format("%.2f", minDeposit) + "\n";
    }

}

