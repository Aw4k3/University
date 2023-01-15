public class Word {
    private boolean underline;
    private boolean bold;
    private String text;

    public boolean isUnderlined() {
        return underline;
    }

    public void setUnderlined(boolean underline) {
        this.underline = underline;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }
    
    public Word(String text) {
        this.text = text;
    }

    public String GetResolvedText() {
        String result = this.text;
        if (bold) result = "*" + result + "*";
        if (underline) result = "_" + result + "_";

        return result;
    }
}
