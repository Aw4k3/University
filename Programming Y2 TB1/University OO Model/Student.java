public class Student extends Person {
    private String studentNumber;
    private boolean marketing;
    private Address address;
    
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public boolean isMarketing() {
        return marketing;
    }
    public void setMarketing(boolean marketing) {
        this.marketing = marketing;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
