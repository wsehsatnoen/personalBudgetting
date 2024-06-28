import java.util.Map;
import java.util.HashMap;

public class CreditAccount{

    private final String name;
    private double balance;
    private final Map<String, Double> transactionLog;


    //Constructor
    //Did not want a credit account to have a startingBalance, so I did not make it a child of
    //accounts. I'd rather it be like a nephew instead...
    public CreditAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.transactionLog = new HashMap<>();
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    //Same ordeal as with the transactionLog in Accounts, string would be too messy rn.
    public void printTransactionLog() {
        for (Map.Entry<String, Double> entry : this.transactionLog.entrySet()) {
            System.out.println(entry);
        }
    }

    //Application
    //Got to keep in mind that credit is going to be a viewed as a Positive number, even though credit
    //is theoretically a negative balance per a persons net worth.
    public void addTransaction(String reason, double amount) {
        this.balance += amount;
        this.logTransaction(reason, amount);
    }

    //Since it's the same everytime, I just typed in the parameters
    public void payCreditBill(CashAccount fromAccount, double amount) {
        this.balance -= amount;
        fromAccount.withdraw("Paying " + this.name, amount);
        this.logTransaction("Credits Applied", -amount);
    }

    //I WISH I knew HOW TO make a COUSIN instead of a child so that I wouldn't have to DUPLICATE
    //the same function for a different class (Wait i could, but i need to stop here for now)
    public void logTransaction(String reason, double amount) {
        String transactionName = reason + " - " + Math.floor(Math.random() * 100000);
        this.transactionLog.put(transactionName, amount);
    }

}
