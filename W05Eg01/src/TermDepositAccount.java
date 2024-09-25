public class TermDepositAccount extends Savings{
    private int term;

    public TermDepositAccount(double balance, String acct_id, double intRate, double intAmount, int term) {
        super(balance, acct_id, intRate, intAmount);
        this.term = term;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
