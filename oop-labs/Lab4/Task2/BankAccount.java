package Task2;

class BankAccount {
    
    private double balance;
    private String owner;
    private String accountNumber;
    protected static int numberOfAccounts = 100001;
    
    public BankAccount() {
        balance = 0.0;
        accountNumber = numberOfAccounts + "";
        numberOfAccounts ++;
    }
    
    public BankAccount(String name, double amount) {
        owner = name;
        balance = amount;
        accountNumber = numberOfAccounts + "";
        numberOfAccounts ++;
    }
    
    public BankAccount(BankAccount oldaccount, double amount) {
        balance = amount;
        accountNumber = oldaccount.accountNumber;
        owner = oldaccount.owner;
        numberOfAccounts ++;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }   
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setBalance(double amount) {
        balance = amount;
    }
    
    public void setAccountNumber(String newAccountNumber) {
        accountNumber = newAccountNumber;
    }
    
}
