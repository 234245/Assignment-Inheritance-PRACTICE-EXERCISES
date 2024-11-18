public class CheckingAccount {
    private double balance;
    private int transactionCount;

    //  balance and transaction count
    public CheckingAccount(double initialBalance) {
        balance = initialBalance;
        transactionCount = 0;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        transactionCount++;
        applyTransactionFee();
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionCount++;
            applyTransactionFee();
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Method to compute and apply the transaction fee if necessary
    private void applyTransactionFee() {
        if (transactionCount > 3) {
            balance -= 1;  // Apply $1 fee
            System.out.println("Transaction fee of $1 applied.");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }
    // toString method
    @Override
    public String toString() {
        return "Balance: $" + balance + ", Transactions: " + transactionCount;
    }
}
