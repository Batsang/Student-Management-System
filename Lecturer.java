public class Lecturer {

    private int lecturerID;
    private String lecturerName;
    private String lecturerEmail;

    // constructors
    public Lecturer(int lecturerID, String lecturerName, String lecturerEmail) {
        this.lecturerID = lecturerID;
        this.lecturerName = lecturerName;
        this.lecturerEmail = lecturerEmail;
    }

    // getters and setters
    public int getLecturerID() {
        return lecturerID;
    }

    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getLecturerEmail() {
        return lecturerEmail;
    }

    public void setLecturerEmail(String lecturerEmail) {
        this.lecturerEmail = lecturerEmail;
    }
}
