

public class BankTest {
    public static void main(String[] args) {
        BankAccount newClient = new BankAccount();

        newClient.getCheckingBalance();

        newClient.depositChecking(520.50);
        newClient.depositSavings(3245.34);

        newClient.withdrawChecking(23);
        newClient.withdrawSavings(543);

        newClient.displayAccounts();

        System.out.println(BankAccount.totalAccounts);
        
    }
}
