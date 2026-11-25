import java.util.Date;

public class Student extends Person {
    private String studentId; // NIM
    private double gpa; // IP
    private String major; // jurusan
    private String degree; // Sarjana, Magister, Doktor
    private int expectedGraduationYear;

    public Student(String firstName, String middleName, String lastName,
                   Date dateOfBirth, String studentId, String major,
                   String degree, int expectedGraduationYear) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.studentId = studentId;
        this.major = major;
        this.degree = degree;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = 0.0;
    }

    public String getStudentId() { return studentId; }
    public double getGpa() { return gpa; }
    public String getMajor() { return major; }
    public String getDegree() { return degree; }
    public int getExpectedGraduationYear() { return expectedGraduationYear; }

    public void changeMajor(String newMajor) {
        major = newMajor;
    }

    public double calculateGpa(String[] grades) {
        if (grades == null || grades.length == 0) {
            gpa = 0.0;
            return gpa;
        }

        double total = 0;
        for (String grade : grades) {
            total += gradeToPoints(grade);
        }
        gpa = total / grades.length;
        return gpa;
    }

    private double gradeToPoints(String grade) {
        switch (grade.trim().toUpperCase()) {
            case "A":  return 4.0;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B":  return 3.0;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C":  return 2.0;
            case "D":  return 1.0;
            case "F":  return 0.0;
            default:
                throw new IllegalArgumentException("Nilai tidak valid: " + grade);
        }
    }

    // Bisa menjalankan Student.java secara langsung
    public static void main(String[] args) {
        Student student = new Student(
            "Andi", "Budi", "Santoso", new Date(103, 4, 15),
            "12345", "Informatika", "Sarjana", 2027
        );

        String[] grades = {"A", "B", "A-"};
        student.calculateGpa(grades);

        System.out.println("Nama: " + student.getName());
        System.out.println("NIM: " + student.getStudentId());
        System.out.println("Jurusan: " + student.getMajor());
        System.out.println("Program: " + student.getDegree());
        System.out.println("Target lulus: " + student.getExpectedGraduationYear());
        System.out.println("IP: " + student.getGpa());
    }
}
