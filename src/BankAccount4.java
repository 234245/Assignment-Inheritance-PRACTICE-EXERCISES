import java.time.LocalDate;

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

class CheckingAccount extends BankAccount {
    private static final double FIRST_OVERDRAFT_PENALTY = 20.0;
    private static final double ADDITIONAL_OVERDRAFT_PENALTY = 30.0;

    private boolean firstOverdraftThisMonth;
    private int lastWithdrawalMonth;

    public CheckingAccount(double balance) {
        super(balance);
        this.firstOverdraftThisMonth = false;
        this.lastWithdrawalMonth = LocalDate.now().getMonthValue();
    }

    @Override
    public void withdraw(double amount) {
        int currentMonth = LocalDate.now().getMonthValue();

        // Reset overdraft penalty status at the start of a new month
        if (currentMonth != lastWithdrawalMonth) {
            firstOverdraftThisMonth = false;
            lastWithdrawalMonth = currentMonth;
        }

        if (amount > 0) {
            // Check if this withdrawal will result in an overdraft
            if (balance - amount < 0) {
                if (!firstOverdraftThisMonth) {
                    System.out.println("First overdraft this month! A penalty of : $20 .");
                    balance -= amount + FIRST_OVERDRAFT_PENALTY;
                    firstOverdraftThisMonth = true;
                } else {
                    System.out.println("Additional overdraft this month! A penalty of :$30");
                    balance -= amount + ADDITIONAL_OVERDRAFT_PENALTY;
                }
            } else {
                balance -= amount;
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}