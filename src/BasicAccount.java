public class BasicAccount extends BankAccount {

    public BasicAccount(double initialBalance) {
        super(initialBalance); // Call the BankAccount constructor
    }

    @Override
    public void withdraw(double amount) {
        // Only allow withdrawal if there is enough balance
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal not allowed.");
        }
    }
}
