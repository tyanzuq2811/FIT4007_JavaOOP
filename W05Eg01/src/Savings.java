public class Savings extends Account{
    private double intRate;
    private double intAmount;

    public Savings(double balance, String acct_id, double intRate, double intAmount) {
        super(balance, acct_id);
        this.intRate = intRate;
        this.intAmount = intAmount;
    }

    public double getIntRate() {
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public double getIntAmount() {
        return intAmount;
    }

    public void setIntAmount(double intAmount) {
        this.intAmount = intAmount;
    }

    private double calculateInterest() {
        intAmount = getBalance() * intRate;
        return intAmount;
    }

    public void addInterestToBalance() {
    }
}
