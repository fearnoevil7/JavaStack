public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankaccount1 = new BankAccount(25.00, 50.00);
        BankAccount bankaccount2 = new BankAccount(50.00, 100.00);
        BankAccount bankaccount3 = new BankAccount(100.00, 200.00);
        System.out.println(bankaccount1);
        String bankaccount1Num = bankaccount1.showAccountNumber();
        System.out.println("Bank account 1 account number...      " + bankaccount1Num);
        System.out.println(bankaccount1.getCheckingBalance());
        System.out.println(bankaccount1.getSavingsBalance());
        System.out.println(bankaccount2);
        String bankaccount2Num = bankaccount2.showAccountNumber();
        System.out.println("Bank account 2 account number....     " + bankaccount2Num);
        bankaccount2.Deposit(50.00, "Checking");
        System.out.println(bankaccount2.getCheckingBalance());
        System.out.println(bankaccount2.getSavingsBalance());
        System.out.println("Bank account 3 account number.....     " + bankaccount3);
        String bankaccount3Num = bankaccount3.showAccountNumber();
        System.out.println(bankaccount3Num);
        System.out.println(bankaccount3.getCheckingBalance());
        bankaccount3.Withdraw(50.00, "Savings");
        System.out.println(bankaccount3.getSavingsBalance());
        System.out.println("Total number of account is       " + bankaccount1.numberOfAccounts);
        System.out.println("Total balance for this account is     " + bankaccount2.getTotalAccountBalance(bankaccount2));
    }
}