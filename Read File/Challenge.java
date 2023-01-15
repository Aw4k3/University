import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Challenge {
    public static void readFile() throws FileNotFoundException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/myfiles/japi-io/readfile.txt"));
            String line = "";
            while ((line = br.readLine()) != null) System.out.println(line);
            br.close();
        } catch(Exception e) {

        }
    }
}