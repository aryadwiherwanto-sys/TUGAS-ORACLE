public class Nomor6 {
    public static void main(String[] args) {
        Student mary = new Student("Mary Jones", 14, 46);
        Student john = new Student("John Stiner", 60, 173);
        Student ari = new Student("Ari Samala", 31, 69);

        System.out.printf("Sebelum: %s, %d kredit, %d poin mutu, IP %.2f%n",
                ari.getName(), ari.getCredits(), ari.getGradePoints(), ari.getGPA());

        ari.addSemester(13, 52); // tambah 13 kredit dan 52 poin mutu

        System.out.printf("Sesudah: %s, %d kredit, %d poin mutu, IP %.2f%n",
                ari.getName(), ari.getCredits(), ari.getGradePoints(), ari.getGPA());
    }
}
