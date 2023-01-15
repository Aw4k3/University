import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<String, Integer>();
        input.put("one", 1);
        input.put("two", 2);
        input.put("three", 3);

        Integer[] output = Challenge.mapValuesToArray(input);
        System.out.println(output.length);
        for (Integer i : output) {
            System.out.println(i);
        }

        // The order of the values is irrelevant but should consist of the array length
        // followed by
        // the values (1,2,3) in any order - for example
        // 3
        // 1
        // 2
        // 3
    }
}