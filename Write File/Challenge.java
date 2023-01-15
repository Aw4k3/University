import java.io.File;
import java.io.FileWriter;

public class Challenge {
    public static void writeFile() {
        try {
            File f = new File("/myfiles/japi-io/writefile.txt");
            f.createNewFile();

            FileWriter fw = new FileWriter(f);
            fw.write("Hello there.\nThis is a file I made.");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}