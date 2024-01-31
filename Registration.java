public class Registration {
    
    private Course studentCourses;
    private Student student;

    // constructors
    public Registration(Course studentCourses, Student student) {
        this.studentCourses = studentCourses;
        this.student = student;
    }

    // getters and setters 
    public Course getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Course studentCourses) {
        this.studentCourses = studentCourses;
    }

    public Student getStudent() {
        return student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

}
