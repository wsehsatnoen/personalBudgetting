public class InvestmentAccount extends Accounts{

    private final boolean isLiquidable;

    public InvestmentAccount(String name, double startingBalance, boolean isLiquidable) {
        super(name, startingBalance);
        this.isLiquidable = isLiquidable;
    }

    //Created this simply to put this parameter here.
    public boolean getIsLiquidable() {
        return this.isLiquidable;
    }

}
