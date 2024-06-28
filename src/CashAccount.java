public class CashAccount extends Accounts{


    //Constructor
    public CashAccount(String name, double startingBalance) {
        super(name, startingBalance);
    }

    //Application
    //Since InvestmentAccounts will not be transferring money to external things,
    //I just gave the cash accounts the functionality of depositing and withdrawing.
    public void deposit(String reason, double amount) {
        this.currentBalance += amount;
        this.addTransaction(reason, amount);
    }

    public void withdraw(String reason, double amount) {
        this.currentBalance -= amount;
        this.addTransaction(reason, -amount);
    }

}
