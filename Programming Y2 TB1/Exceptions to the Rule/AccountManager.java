import java.util.ArrayList;

public class AccountManager {
    private String name;
    private ArrayList<Customer> customers = new ArrayList();

    public double getCollectiveBalance() {
        double total = 0;
        for (Customer singleCustomer : customers) {
            total += singleCustomer.getDiscountedBalance();
        }
        return total;
    }

    public void addCustomer(Customer customer) {
        this.getCustomers().add(customer);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

}
