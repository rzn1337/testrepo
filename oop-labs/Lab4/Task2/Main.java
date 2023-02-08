package Task2;

public class Main {
    
    public static void main(String[] args) {
        
        BankAccount obj = new BankAccount("simali", 500);
       
        obj.deposit(50);
        obj.withdraw(450);
        System.out.println(obj.getBalance());
        System.out.println(obj.getOwner());
        System.out.println(obj.getAccountNumber());
       
        System.out.println();
       
        CheckingAccount obj1 = new CheckingAccount("alisim", 1000);
       
        obj1.deposit(50);
        obj1.withdraw(450);
        System.out.println(obj1.getBalance());
        System.out.println(obj1.getOwner());
        System.out.println(obj1.getAccountNumber());
       
        System.out.println();
       
        SavingsAccount obj2 = new SavingsAccount("naamdalou", 5000);
       
        obj2.deposit(50);
        obj2.withdraw(450);
        System.out.println(obj2.getBalance());
        System.out.println(obj2.getOwner());
        System.out.println(obj2.getAccountNumber());
       
        System.out.println();
       
        SavingsAccount obj3 = new SavingsAccount("ali", 600);
       
        obj3.deposit(50);
        obj3.withdraw(450);
        System.out.println(obj3.getBalance());
        System.out.println(obj3.getOwner());
        System.out.println(obj3.getAccountNumber());
       
        System.out.println();

    }
}
