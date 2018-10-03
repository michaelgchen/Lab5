import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Checkings is one of the types of accounts.
         */
        CHECKINGS,
        /**
         * Savings is another type.
         */
        SAVINGS,
        /**
         * Students is another type.
         */
        STUDENT,
        /**
         * Workplace is another type.
         */
        WORKPLACE
    }

    /**
     * accountNumber is the account number.
     */
    private int accountNumber;
    /**
     * accountType is the account type.
     */
    private BankAccountType accountType;
    /**
     * accountBalance is the balance.
     */
    private double accountBalance;
    /**
     *ownerName is the name of the owner
     */
    private String ownerName;
    /**
     *interestRate is the the rate of interest
     */
    private double interestRate;
    /**
     *interestEarned is the earned interest
     */
    private double interestEarned;



    /**
     * Constructor for Bank account
     *
     * @param name            of the owner
     * @param accountCategory type of the bank account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.setTotalAccounts();
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */


    /**
     * @return account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @return owner name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @return account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * @return interestRate;
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @return interestEarned;
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param setAccountNumber = account number
     */
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    /**
     * @param setAccountType = account type
     */
    public void setAccountType(final BankAccountType setAccountType) {
        this.accountType = setAccountType;
    }

    /**
     * @param setAccountBalance = account balance
     */
    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }

    /**
     * @param setInterestRate = interest rate
     */
    public void setInterestRate(final double setInterestRate) {
        this.interestRate = setInterestRate;
    }

    /**
     * @param setInterestEarned is the interest earned
     */
    public void setInterestEarned(final double setInterestEarned) {
        this.interestEarned = setInterestEarned;
    }

    /**
     * @param setOwnerName is the name of the owner
     */
    public void setOwnerName(String setOwnerName) {
        this.ownerName = setOwnerName;
    }

}