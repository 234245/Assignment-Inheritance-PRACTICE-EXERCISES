public class Main {
    public static void main(String[] args) {
        // Create a CheckingAccount
        CheckingAccount account = new CheckingAccount(100);

        // Perform some transactions
        System.out.println(account);
        account.deposit(50);
        System.out.println(account);
        account.withdraw(20);
        System.out.println(account);
        account.deposit(30);
        System.out.println(account);
        account.withdraw(10);
        System.out.println(account);
        account.deposit(20);
        System.out.println(account);
    }
}
