public class Student {

    // instance variables
    private int studentID;
    private String studentName;
    private String email;
    private int year;
    private Course course;


    // constructors

    public Student(int studentID, String studentName, String email, int year) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.email = email;
        this.year = year;
    }


    // getters and setters

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Course> getAllCourses() {
        
    }
    public List<Course> getRegisteredCourses() {
        return getRegisteredCourses(this);
    }
}