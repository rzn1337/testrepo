package Task2;

public class SavingsAccount extends BankAccount {
    
    private static double rate = 0.025;        
    private static int savingsNumber = 0;
    private String accountNumber;
    
    public SavingsAccount(String name, double amount) {
        super(name, amount);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
        savingsNumber ++;
    }
    
    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
        savingsNumber ++;
    }
    
    public void postInterest() {
        double interest = super.getBalance()*rate*(1/12);
        super.deposit(interest);
    }
    
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}
