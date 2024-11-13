public class Main {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(100.0);
        System.out.println("Initial balance: $" + account.getBalance());
        account.withdraw(150.0);
        System.out.println("Balance after first overdraft withdrawal of $150: $" + account.getBalance());
        account.withdraw(50.0);
        System.out.println("Balance after additional overdraft withdrawal of $50: $" + account.getBalance());
        System.out.println("\n--- New Month ---\n");
        account = new CheckingAccount(account.getBalance());

        account.withdraw(50.0);
        System.out.println("Balance after first overdraft in new month of $50: $" + account.getBalance());
    }
}