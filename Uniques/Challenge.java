import java.util.Arrays;
import java.util.HashSet;

public class Challenge {
    public static String[] uniques(String[] arr) {
        return new HashSet<String>(Arrays.asList(arr)).toArray(new String[0]);
    }
}