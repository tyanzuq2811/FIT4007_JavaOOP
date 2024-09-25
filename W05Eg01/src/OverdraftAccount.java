public class OverdraftAccount extends Account{
    private double odLimit;
    private double overdraft;
    private double availableBalance;

    public OverdraftAccount(double balance, String acct_id, double odLimit, double overdraft, double availableBalance) {
        super(balance, acct_id);
        this.odLimit = odLimit;
        this.overdraft = overdraft;
        this.availableBalance = availableBalance;
    }

    public double getOdLimit() {
        return odLimit;
    }

    private void setOdLimit(double odLimit) {
        this.odLimit = odLimit;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    private void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }


}
