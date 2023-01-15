public class Module {
    private String name;
    private String lectureVenue;
    private String dayOfWeek;
    private String time;
    private Lecturer lecturer;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLectureVenue() {
        return lectureVenue;
    }
    public void setLectureVenue(String lectureVenue) {
        this.lectureVenue = lectureVenue;
    }
    public String getDayOfWeek() {
        return dayOfWeek;
    }
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public Lecturer getLecturer() {
        return lecturer;
    }
    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
