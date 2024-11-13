public class Main {
    public static void main(String[] args) {
        BasicAccount account = new BasicAccount(100.0);
        System.out.println("Initial balance:  $" + account.getBalance());

        // Withdraw without overdraft
        account.withdraw(50.0);
        System.out.println("Balance after withdrawing  $50: $" + account.getBalance());

        // Withdraw causing overdraft
        account.withdraw(70.0);
        System.out.println("Balance after overdraft withdrawal of  $70: $" + account.getBalance());
    }
}