public class Main {
    public static void main(String[] args) {
        Sock sock1 = new Sock("red", 10, "cotton");
        Sock sock2 = new Sock("purple", 12, "polyester");
        Sock sock3 = new Sock("green", 10, "nylon");
        Drawer topdrawer = new Drawer();
        topdrawer.addSock(sock1);
        topdrawer.addSock(sock2);
        topdrawer.addSock(sock3);
        System.out.println(topdrawer.getSock(1)); // should be first red one
        System.out.println(topdrawer.getSock(2)); // should be purple one
        System.out.println(topdrawer.getSock(3)); // should be green one
        System.out.println(topdrawer.hasPair()); // should be false (no pair yet)

        Sock sock4 = new Sock("red", 10, "cotton");

        topdrawer.addSock(sock4);
        // the above line should add a fourth sock, but will fail to do
        // so on the original code.

        System.out.println(topdrawer.getSock(4));
        // the above line will not return the second red sock on the original
        // code. However, once refactored, it should show the second red sock.

        System.out.println(topdrawer.hasPair());
        // the above line should result in true, because there are two
        // red cotton socks of 10cm in the drawer. The original code will
        // not give a correct response here. Your refactored solution
        // should show true here.
    }
}