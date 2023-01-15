import java.util.ArrayList;

public class Line {
    private ArrayList<Word> words = new ArrayList<Word>();

    public Line(String content) {
        for (String word : content.split(" ")) words.add(new Word(word));
    }

    public Line(Word[] content) {
        for (Word word : content) words.add(word);
    }

    public void addWord(Word word) {
        words.add(word);
    }

    public Word getWord(int i) {
        return words.get(i - 1);
    }

    public int getNumberOrWords() {
        return words.size();
    }
}
