public class Account {
    private double balance;

    public Account() {
        balance = 10;
    }
    
    public double getBalance() {
        return balance;
    }

    public void withdraw(double howMuch) {
        if (balance - howMuch > 0) balance -= howMuch;
        else System.out.println("Error - insufficent funds");
    }

    public void deposit(double howMuch) {
        balance += howMuch;
    }
}