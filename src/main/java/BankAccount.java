import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.totalAccounts++;
    }

    public void setAccountNumber(int setNum) {
        this.accountNumber = setNum;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void withdraw(double amount) {
        this.accountBalance -= amount;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }
}