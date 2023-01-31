public class Main {
  public static void main(String[] args) {
    /***
     * NONE OF THE BELOW WILL RUN UNLESS YOU CREATE ALL THE
     * CLASSES SPECIFIED IN THE EXERCISE!!!!!
     ***/

    Document d = new Document();
    Line l = new Line("This is a test line");
    d.addLine(l);
    Word[] words = { new Word("My"), new Word("second"), new Word("line"), new Word("now") };
    words[0].setUnderlined(true);
    words[1].setBold(true);
    words[1].setUnderlined(true);
    words[2].setBold(true);
    Line l2 = new Line(words);
    d.addLine(l2);
    d.addWord(new Word("hooray"));
    d.generatePreview();

    // should get
    // This is a test line
    // _My_ _*second*_ *line* now hooray
  }
}