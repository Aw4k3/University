public class Customer {
    private String name;
    private double balance;
    private double discount = 1;

    public double getDiscountedBalance() {
        return this.getBalance() / this.getDiscount();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setDiscount(double discount) {
        if (discount > 0) this.discount = discount;
        else throw new ArithmeticException("<double: Discount> must be greater than 0");
    }

    public double getDiscount() {
        return this.discount;
    }

}