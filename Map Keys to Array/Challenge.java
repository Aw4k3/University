import java.util.Map;

public class Challenge {
    public static String[] mapKeysToArray(Map<String, Integer> map) {
        return map.keySet().toArray(new String[0]);
    }
}