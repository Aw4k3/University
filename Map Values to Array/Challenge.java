import java.util.Map;

public class Challenge {
    public static Integer[] mapValuesToArray(Map<String, Integer> map) {
        return map.values().toArray(new Integer[0]);
    }
}