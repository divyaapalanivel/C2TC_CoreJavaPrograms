package day2;

public class BankTest {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("ACC123456", "Divyaa", 50000);
        
        System.out.println(account);
        
        account.deposit(15000);
        System.out.println("New Balance: $" + account.getBalance());
        
        account.withdraw(20000);
        System.out.println("New Balance: $" + account.getBalance());
        
        account.withdraw(50000); // This will fail as the balance is 45k
        
        System.out.println(account);
    }
}

