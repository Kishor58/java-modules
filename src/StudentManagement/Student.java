package StudentManagement;

public class Student {
    private int studentId;
    private String name;
    private String email;
    private String course;
    private double cgpa;

    public Student(int studentId, String name, String email, String course, double cgpa) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.course = course;
        this.cgpa = cgpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", cgpa='" + cgpa + '\'' +
                '}';
    }
}
