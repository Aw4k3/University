public class Main {
    public static void main(String[] args) {
        String[] test1 = { "one", "two", "two", "three", "three", "one", "bumpers" };
        String[] results = Challenge.uniques(test1);
        for (String result : results) {
            System.out.println(result);
        }
        // should get one,two,three,bumpers
    }
}