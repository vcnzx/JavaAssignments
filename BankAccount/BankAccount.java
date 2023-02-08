

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    static int totalAccounts;
    static double totalAccountBalances;

    public BankAccount(){
        totalAccounts++;
    }

    public void getCheckingBalance(){
        System.out.println(checkingBalance);
    }

    public void getSavingsBalance(){
        System.out.println(savingsBalance);
    }

    public void depositChecking(double amount){
        this.checkingBalance += amount;
        totalAccountBalances += amount;
    }

    public void depositSavings(double amount){
        this.savingsBalance += amount;
        totalAccountBalances += amount;
    }

    public void withdrawChecking(double amount){
        if(amount > this.checkingBalance){
            System.out.println("Insufficient funds");
        }
        else{
            this.checkingBalance -= amount;
            totalAccountBalances -= amount;
        }
    }

    public void withdrawSavings(double amount){
        if(amount > this.savingsBalance){
            System.out.println("Insufficient funds");
        }
        else {
            this.savingsBalance -= amount;
            totalAccountBalances -= amount;
        }
    }

    public void displayAccounts(){
        System.out.println("Checking account balance: $" + this.checkingBalance);
        System.out.println("Savings account balance: $" + this.savingsBalance);
        System.out.println("Total balances from accounts: $" + totalAccountBalances);
    }
}
