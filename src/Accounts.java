import java.util.HashMap;
import java.util.Map;

public class Accounts {

    private final String name;
    private final double startingBalance;
    protected double currentBalance;
    private final Map<String, Double> transactionLog;


    //Constructor (put the hash map initialization in the constructor because otherwise
    //I don't think I would have been able to create multiples of it with different objects.)
    public Accounts(String name, double startingBalance) {
        this.name = name;
        this.startingBalance = startingBalance;
        this.currentBalance = startingBalance;
        this.transactionLog = new HashMap<>();
    }


    //Getters
    public double getStartingBalance() {
        return this.startingBalance;
    }

    public double getCurrentBalance() {
        return this.currentBalance;
    }

    public String toString() {
        return this.name + ": " + this.startingBalance;
    }

    //Just wanted to print it to the console because returning it was going to be a lot for
    // now...
    public void printTransactionLog() {
        for (Map.Entry<String, Double> entry : this.transactionLog.entrySet()) {
            System.out.println(entry);
        }
    }

    //Application
    //Allows money to be transferred between all accounts
    public void sendTransfer(Accounts accountTo, double amount){
        accountTo.receiveTransfer(this, amount);
        this.currentBalance -= amount;
        this.addTransaction(accountTo.name, -amount);
    }
    //By doing a send and receive function, I can easily allow both accounts created their own
    //entry into their own transaction log;
    public void receiveTransfer(Accounts accountFrom, double amount) {
        this.currentBalance += amount;
        this.addTransaction(accountFrom.name, amount);
    }
    //Used by a lot of things to simply add an entry to their own transaction log
    public void addTransaction(String accountName, double amount) {
        String transactionName = accountName + " - " + Math.floor(Math.random() * 100000);
        this.transactionLog.put(transactionName, amount);
        System.out.println("Logged transaction as {" + transactionName + " : " + amount + "}");
    }

}
