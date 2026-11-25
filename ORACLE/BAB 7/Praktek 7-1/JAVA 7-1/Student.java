
public class Student {
    private String name;
    private int credits;
    private double gpa;
    private int gradePoints;

    public Student(String name, int credits, int gradePoints) {
        this.name = name;
        this.credits = credits;
        this.gradePoints = gradePoints;
        this.gpa = (double) gradePoints / credits;
    }

    // (a) Mengembalikan IP saat ini = poin mutu / kredit
    public double getGPA() {
        return (double) gradePoints / credits;
    }

    // (b) Menambah kredit dan poin mutu, lalu memperbarui IP
    public void addSemester(int newCredits, int newGradePoints) {
        credits += newCredits;
        gradePoints += newGradePoints;
        gpa = (double) gradePoints / credits;
    }

    public String getName() { return name; }
    public int getCredits() { return credits; }
    public int getGradePoints() { return gradePoints; }
    public double getStoredGpa() { return gpa; }
}
