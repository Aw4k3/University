public class Main {
    // This class is for testing your code before submitting
    // There is some test code for the provided Event class
    // You can modify this class
    public static void main(String[] args) {
        // Test Event default constructor
        Event e0 = new Event();
        System.out.println(e0);
        // Test Event Parameterised constructor
        Event e1 = new Event("Consultation", 1);
        System.out.println(e1);
        // Test ticketsAvailable
        System.out.println("Tickets Available:" + e1.ticketsAvailable());
        // Test sellTickets
        System.out.println("Ticket Sold:" + e1.sellTicket());
        System.out.println("Tickets Available:" + e1.ticketsAvailable());
        System.out.println(e1);
    }
}
