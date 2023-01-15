public class Main {
    public static void main(String[] args) {
        String[] nopair = { "Apple", "Orange", "Banana", "Python", "Zebra" };
        String[] nopair2 = { "Green", "Blue", "Yellow", "Red" };
        String[] pair = { "Fred", "Harry", "Bill", "Fred", "Jane", "Kate" };
        System.out.println(Challenge.hasPair(nopair)); // should be false
        System.out.println(Challenge.hasPair(nopair2)); // should be false
        System.out.println(Challenge.hasPair(pair)); // should be true
    }
}