
import java.util.InputMismatchException;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka: ");
            int angka = in.nextInt();
            System.out.println("Angka Anda: " + angka);
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
        }

        in.close();
    }
}
