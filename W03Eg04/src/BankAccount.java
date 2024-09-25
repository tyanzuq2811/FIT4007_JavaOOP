public class BankAccount {
    private double balance;
    private int accountNumber;
    private static int lastAssigneNumber = 1000;
    public static double OVERDRAFT_FEE = 0.02;

    public BankAccount() {
        lastAssigneNumber++;
        accountNumber = lastAssigneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
