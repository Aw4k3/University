import java.util.ArrayList;

public class Document {
    private String name;
    private String author;
    private int priority;
    private ArrayList<Line> lines = new ArrayList<Line>();

    public int getNumberOfWords() {
        int result = 0;
        for (Line line : lines) result += line.getNumberOrWords();
        return result;
    }

    public int getNumberOfLines() {
        return lines.size();
    }

    public void addLine(Line line) {
        lines.add(line);
    }

    public void addWord(Word word) {
        lines.get(lines.size() - 1).addWord(word);
    }

    public void generatePreview() {
        ArrayList<String> result = new ArrayList<String>();
        for (Line line : lines) {
            for (int i = 0; i < line.getNumberOrWords(); i++) {
                result.add(line.getWord(i + 1).GetResolvedText());
            }
            result.add("\n");
        }

        System.out.println("");
    }
}
