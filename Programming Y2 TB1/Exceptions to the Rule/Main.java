public class Main {
    // NOOBLAB READONLY
    // You are not expected to modify the main method.
    // This is just provided so you can test whether your app
    // actually throws an error when it should.

    public static void main(String[] args) {
        Customer fred = new Customer();
        fred.setName("Fred Flintstone");
        fred.setBalance(257.00);
        fred.setDiscount(1);

        Customer jane = new Customer();
        jane.setName("Jane Doe");
        jane.setBalance(12.99);
        jane.setDiscount(-1.5); // this shouldn't be allowed

        Customer bill = new Customer();
        bill.setName("Bill Bloggs");
        bill.setBalance(1200.50);
        bill.setDiscount(0); // this shouldn't be allowed either

        AccountManager paul = new AccountManager();
        paul.setName("Paul Neve");
        paul.addCustomer(fred);
        paul.addCustomer(jane);
        paul.addCustomer(bill);

        System.out.println(paul.getCollectiveBalance());
    }
}