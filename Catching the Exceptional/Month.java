public class Month {
    private static String[] monthnames = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

    public static String getMonth(int i) {
        try {
            return monthnames[i - 1];
        } catch (Exception e) {
            return "illegal";
        }
    }
}