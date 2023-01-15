public class Lecturer extends Person {
    private String employeeNumber;
    private String NInumber;
    private String jobTitle;
    private double salary;
    
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String getNInumber() {
        return NInumber;
    }
    public void setNInumber(String nInumber) {
        NInumber = nInumber;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
