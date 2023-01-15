import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<String, Integer>();
        input.put("one", 1);
        input.put("two", 2);
        input.put("three", 3);

        String[] output = Challenge.mapKeysToArray(input);
        System.out.println(output.length);
        for (String s : output) {
            System.out.println(s);
        }

        // Printing out without loop - order of the values is irrelevant but should
        // consist of the array length followed by
        // values in any order. In this case
        // 3
        // one
        // two
        // three
    }
}