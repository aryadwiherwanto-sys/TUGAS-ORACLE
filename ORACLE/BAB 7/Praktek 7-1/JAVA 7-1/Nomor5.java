public class Nomor5 {
    public static void main(String[] args) {
        Student mary = new Student("Mary Jones", 14, 46);
        Student john = new Student("John Stiner", 60, 173);
        Student ari = new Student("Ari Samala", 31, 69);

        System.out.printf("%s: %d kredit, %d poin mutu, IP %.2f%n",
                mary.getName(), mary.getCredits(), mary.getGradePoints(), mary.getGPA());
        System.out.printf("%s: %d kredit, %d poin mutu, IP %.2f%n",
                john.getName(), john.getCredits(), john.getGradePoints(), john.getGPA());
        System.out.printf("%s: %d kredit, %d poin mutu, IP %.2f%n",
                ari.getName(), ari.getCredits(), ari.getGradePoints(), ari.getGPA());
    }
}
