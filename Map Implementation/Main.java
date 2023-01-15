public class Main {
    public static void main(String[] args) {
        Map test = new Map();
        test.put("paul", "neve");
        test.put("fred", "bloggs");
        test.put("bill", "smith");
        test.put("paul", "jones");

        // should print bloggs
        System.out.println(test.get("fred"));

        // should print smith
        System.out.println(test.get("bill"));

        // should still print bloggs
        System.out.println(test.get("fred"));

        // should print jones - neve should have been replaced
        System.out.println(test.get("paul"));

        // should return (and print) null
        System.out.println(test.get("nobody"));
    }
}