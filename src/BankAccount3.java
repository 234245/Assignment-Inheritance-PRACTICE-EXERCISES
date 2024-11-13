// Assuming there is a superclass BankAccount with basic functionalities

class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

// Subclass BasicAccount
class BasicAccount extends BankAccount {
    private static final double OVERDRAFT_PENALTY = 30.0;

    public BasicAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            // Check if this withdrawal will result in an overdraft
            if (balance - amount < 0) {
                System.out.println("Overdraft! A penalty of $30 will be applied.");
                balance -= amount + OVERDRAFT_PENALTY; // Apply penalty
            } else {
                balance -= amount; // No penalty
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}



