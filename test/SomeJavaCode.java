import java.util.Scanner;

public class SomeJavaCode {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        String name = myScan.nextLine();
        while (true) {
            if (name.equalsIgnoreCase("M")) {
                System.out.println("Monday");
                break;
            } else if (name.equalsIgnoreCase("Tu")) {
                System.out.println("Tuesday");
                break;
            } else if (name.equalsIgnoreCase("W")) {
                System.out.println("Wednesday");
                break;
            } else if (name.equalsIgnoreCase("Th")) {
                System.out.println("Thursday");
                break;
            } else if (name.equalsIgnoreCase("F")) {
                System.out.println("Friday");
                break;
            } else if (name.equalsIgnoreCase("Sa")) {
                System.out.println("Saturday");
                break;
            } else if (name.equalsIgnoreCase("Su")) {
                System.out.println("Sunday");
                break;
            } else if (!name.equalsIgnoreCase("M") && !name.equalsIgnoreCase("Tu") && !name.equalsIgnoreCase("W")
                    && !name.equalsIgnoreCase("Th") && !name.equalsIgnoreCase("F") && !name.equalsIgnoreCase("Sa")
                    && !name.equalsIgnoreCase("M") && !name.equalsIgnoreCase("M")) {
                System.out.println("error try again");
                System.out.println("Enter the day of the week");
                String name2 = myScan.nextLine();
                name = name2;
            }
        }
    }
}