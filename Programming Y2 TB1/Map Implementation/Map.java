public class Map {
    String[] k = new String[10];
    String[] v = new String[10];

    public void put(String key, String value) {
        // I don't understand my own code but it still works
        for (int i = 0; i < 10; i++) {
            if (k[i] != null) {
                if (k[i].equals(key)) {
                    v[i] = value;
                    return;
                }
            }

            if (k[i] == null) {
                k[i] = key;
                v[i] = value;
                return;
            }
        }
    }

    public String get(String key) {
        for (int i = 0; i < k.length; i++)
            if (k[i] != null)
                if (k[i].equals(key))
                    return v[i];
        return null;
    }
}