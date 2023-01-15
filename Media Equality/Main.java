import java.util.*;

public class Main {

    public static void main(String[] args) {

        MediaItem p1 = new MediaItem("Prince");
        MediaItem q1 = new MediaItem("Queen");
        MediaItem p2 = new MediaItem("prince ");

        if (p1.equals(p2)) {
            System.out.println("correct -- we are asked to ignore differences " +
                    "between upper and lower case characters");
        } else {
            System.out.println("incorrect -- we are asked to ignore differences " +
                    "between upper and lower case characters");
        }
        if (p1.equals(q1) == false) {
            System.out.println("correct -- these are different");
        } else {
            System.out.println("incorrect -- these are different");
        }

        // (there should be two items in the set, if the .equals() method is working
    }

}
