public class TestBasicAccount {
    public static void main(String[] args) {
        BasicAccount account = new BasicAccount(100.0);

        System.out.println("Initial Balance: $" + account.getBalance());

        // Successful withdrawal
        account.withdraw(50.0);
        System.out.println("Balance after withdrawing $50: $" + account.getBalance());

        // Attempt to withdraw more than available balance
        account.withdraw(100.0);
        System.out.println("Balance after attempting to withdraw $100: $" + account.getBalance());
    }
}
