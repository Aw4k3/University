import java.util.*;

public class Main {

    public static void main(String[] args) {

        MediaItem princeKey = new MediaItem("Prince");
        MediaItem queenKey = new MediaItem("Queen");
        MediaItem anotherPrinceKey = new MediaItem("Prince");

        Set<MediaItem> myItems = new HashSet<MediaItem>();
        myItems.add(princeKey);
        myItems.add(queenKey);
        myItems.add(anotherPrinceKey);
        System.out.println("there are " + myItems.size() + " items in the set ");
        // (there should be two items in the set, if the .equals() method is working

        Map<MediaItem, Integer> myMap = new HashMap<MediaItem, Integer>();
        myMap.put(princeKey, 10);
        myMap.put(queenKey, 20);
        Integer intValueStoredWithPrince = myMap.get(anotherPrinceKey);
        System.out.println("value stored with Prince Key is " + intValueStoredWithPrince);

        // (intValueStoredWithPrince should be 10)
    }
}