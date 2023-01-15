public class MediaItem {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MediaItem(String t) {
        setTitle(t);
    }
    
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o.getClass() == MediaItem.class)
        if (((MediaItem)o).getTitle().trim().toLowerCase().equals(this.title.trim().toLowerCase())) return true;
        return false;
    }
}