import java.io.Serializable;

class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;

    public Student() {
        // default constructor
    }

    public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    public double getAttendance_percentage() {
        return attendance_percentage;
    }

    public String calculateGrade() throws LowAttendanceException {
        if (attendance_percentage < 60) {
            throw new LowAttendanceException("Attendance below 60% for student: " + sname);
        }

        if (score >= 90) return "A";
        else if (score >= 75) return "B";
        else if (score >= 50) return "C";
        else return "D";
    }

    @Override
    public String toString() {
        return rollno + " - " + sname + " - " + course + " - " + attendance_percentage + "% - Score: " + score;
    }
}
