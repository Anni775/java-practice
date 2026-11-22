package oops;

public class BankAccount {
    final int accountNumber;
    final String accountHolderName;
    private float balance;
    int amount;
    public float getBalance(){
        return balance;
    }
    public String getName(){
        return accountHolderName;
    }
    public int grtAccNo(){
        return accountNumber;
    }

    public BankAccount(int accountNumber, String accountHolderName, float balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit");
        } else {
            balance = balance + amount;
            System.out.println("deposit successful");
        }
    }
    public void withdraw(int amount){
        if( amount> balance){
            System.out.println("Insufficient balance");
            }
        else{
            balance = balance - amount;
            System.out.println("withdraw successful");
        }
    }
}
class costumer{
    static void main(String[] args) {
            BankAccount b1 = new BankAccount(897567,"Ani Kumar",23000);
            b1.deposit(5000);
            b1.deposit(5000);
            b1.withdraw(30000);
            b1.withdraw(5000);
            System.out.println(b1.getBalance());
            System.out.println(b1.getName());
            System.out.println(b1.grtAccNo());
            b1.deposit(0);

    }
}