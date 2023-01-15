import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;

public class Challenge {
  private static List<Task> tasks = new ArrayList();

  public static void readCSVFile(String filename) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(filename));
      String line;
      String[] data;
      while ((line = br.readLine()) != null) {
        data = line.split(",");
        Task t = new Task();
        t.setTitle(data[0]);
        t.setPriority(Integer.parseInt(data[1]));
        t.setTargetDate(LocalDate.parse(data[2]));

        tasks.add(t);
        br.close();
      }
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }

  public static List<Task> getTasks() {
    return tasks;
  }

  public static void setTasks(List<Task> tasks) {
    Challenge.tasks = tasks;
  }
}