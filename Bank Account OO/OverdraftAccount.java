public class OverdraftAccount extends Account {
    private double overdraft;

    public OverdraftAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    public void withdraw(double ammount) {
        if (ammount > getBalance() && ammount <= getBalance() + overdraft) {
            overdraft = ammount - getBalance();
            withdraw(getBalance());
        }

        else if (ammount < getBalance()) withdraw(ammount);

        else System.out.println("Error - insufficent funds");
    }
}
