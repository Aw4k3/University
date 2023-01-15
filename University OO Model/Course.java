public class Course {
    private String name;
    private String department;
    private int durationInYears;
    private Module[] modules;
    private Lecturer lecturer;
    private Student[] students;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getDurationInYears() {
        return durationInYears;
    }
    public void setDurationInYears(int durationInYears) {
        this.durationInYears = durationInYears;
    }
    public Module[] getModules() {
        return modules;
    }
    public void setModules(Module[] modules) {
        this.modules = modules;
    }
    public Lecturer getLecturer() {
        return lecturer;
    }
    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
}
