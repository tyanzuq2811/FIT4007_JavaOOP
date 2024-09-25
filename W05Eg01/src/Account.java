public class Account {
    private double balance;
    private String acct_id;

    public Account(double balance, String acct_id) {
        this.balance = balance;
        this.acct_id = acct_id;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAcct_id() {
        return acct_id;
    }

    public void setAcct_id(String acct_id) {
        this.acct_id = acct_id;
    }

    public boolean withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
