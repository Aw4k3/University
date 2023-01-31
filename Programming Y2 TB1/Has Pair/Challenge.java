import java.util.Arrays;
import java.util.HashSet;

public class Challenge {
    public static boolean hasPair(String[] list) {
        HashSet hashset = new HashSet<String>(Arrays.asList(list));
        if (hashset.size() < list.length) return true;
        return false;
    }
}