import java.util.Random;
public class BankAccount {
    private String accountNumber;
    private Double checkingBalance;
    private Double savingsBalance;
    public static int numberOfAccounts = 0;
    private static Double totalAccountBalance;
    private String getAccountNumber() {
        String characters = "0123456789";
        String newAccountNumber = "";
        int length = 10;
        Random rando = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rando.nextInt(characters.length()));
        }
        for(int i = 0; i < text.length; i++) {
            newAccountNumber += text[i];
        }
        return newAccountNumber;
    }
    public BankAccount(Double checkingBalance, Double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        // Double total = checkingBalance + savingsBalance;
        // totalAccountBalance = total;
        this.accountNumber = getAccountNumber();
        numberOfAccounts ++;
    }
    public Double getCheckingBalance() {
        return this.checkingBalance;
    }
    public Double getSavingsBalance() {
        return this.savingsBalance;
    }
    public void Deposit(Double deposit, String accountType) {
        if (accountType == "Checking") {
            this.checkingBalance += deposit;
            System.out.println("Money successfully depositied Checking Account balance is now       " + this.checkingBalance);
        }
        if (accountType == "Savings") {
            this.savingsBalance += deposit;
            System.out.println("Money successfully depositied savings account balance is now at       " + this.savingsBalance);
        }
    }
    public void Withdraw(Double withrawal, String accountType) {
        if (this.checkingBalance - withrawal > 0) {
            if (accountType == "Checking") {
                this.checkingBalance -= withrawal;
                System.out.println("Money successfully withdrawed Checking Account balance is now       " + this.checkingBalance);
            }
        }
        if (this.savingsBalance - withrawal > 0) {
            if (accountType == "Savings") {
                this.savingsBalance -= withrawal;
                System.out.println("Money successfully withdrawed savings account balance is now at       " + this.savingsBalance);
            }
        }
        if (this.checkingBalance - withrawal < 0) {
            System.out.println("Insufficient funds!!!!!!!!");
        }
        if (this.savingsBalance - withrawal < 0) {
            System.out.println("Insufficient funds!!!!!!!!");
        }
    }
    public static double getTotalAccountBalance(BankAccount account) {
        Double total = account.savingsBalance + account.checkingBalance;
        totalAccountBalance = total;
        System.out.println("Total Account balance is      " + totalAccountBalance);
        return totalAccountBalance;
    }
    public String showAccountNumber() {
        return this.accountNumber;
    }
}