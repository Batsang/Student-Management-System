public class Course {

    private int courseID;
    private int year;
    private double grade;
    private double price;

    // constructors
    public Course(int courseID, int year, double grade, double price) {
        this.courseID = courseID;
        this.year = year;
        this.grade = grade;
        this.price = price;
    }

    // getters and setters
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
}
