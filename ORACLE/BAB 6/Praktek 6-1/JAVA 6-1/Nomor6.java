
import java.util.Scanner;

public class Nomor6 {
    static Scanner in = new Scanner(System.in);

    static int[][] masukkanMatriks(String nama) {
        System.out.print("Jumlah baris matriks " + nama + ": ");
        int baris = in.nextInt();
        System.out.print("Jumlah kolom matriks " + nama + ": ");
        int kolom = in.nextInt();

        int[][] m = new int[baris][kolom];
        System.out.println("Masukkan elemen matriks " + nama + ":");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(nama + "[" + i + "][" + j + "] = ");
                m[i][j] = in.nextInt();
            }
        }
        return m;
    }

    static void tampilkan(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static boolean sudahDiisi(int[][] a, int[][] b) {
        if (a == null || b == null) {
            System.out.println("Matriks A dan B harus diisi dulu.");
            return false;
        }
        return true;
    }

    static int[][] jumlah(int[][] a, int[][] b) {
        int[][] hasil = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                hasil[i][j] = a[i][j] + b[i][j];
        return hasil;
    }

    static int[][] kurang(int[][] a, int[][] b) {
        int[][] hasil = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                hasil[i][j] = a[i][j] - b[i][j];
        return hasil;
    }

    static int[][] kali(int[][] a, int[][] b) {
        int[][] hasil = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    hasil[i][j] += a[i][k] * b[k][j];
        return hasil;
    }

    static boolean ukuranSama(int[][] a, int[][] b) {
        return a.length == b.length && a[0].length == b[0].length;
    }

    static void tampilMenu() {
        System.out.println("\n=== MENU MATRIKS ===");
        System.out.println("a. Masukkan Matriks A");
        System.out.println("b. Masukkan Matriks B");
        System.out.println("c. Tampilkan A + B");
        System.out.println("d. Tampilkan A - B");
        System.out.println("e. Tampilkan A * B");
        System.out.println("f. Keluar");
        System.out.print("Pilih: ");
    }

    public static void main(String[] args) {
        int[][] A = null;
        int[][] B = null;
        char pilihan;

        do {
            tampilMenu();
            pilihan = Character.toLowerCase(in.next().charAt(0));

            switch (pilihan) {
                case 'a':
                    A = masukkanMatriks("A");
                    break;
                case 'b':
                    B = masukkanMatriks("B");
                    break;
                case 'c':
                    if (sudahDiisi(A, B)) {
                        if (ukuranSama(A, B)) tampilkan(jumlah(A, B));
                        else System.out.println("Ukuran matriks harus sama.");
                    }
                    break;
                case 'd':
                    if (sudahDiisi(A, B)) {
                        if (ukuranSama(A, B)) tampilkan(kurang(A, B));
                        else System.out.println("Ukuran matriks harus sama.");
                    }
                    break;
                case 'e':
                    if (sudahDiisi(A, B)) {
                        if (A[0].length == B.length) tampilkan(kali(A, B));
                        else System.out.println("Kolom A harus sama dengan baris B.");
                    }
                    break;
                case 'f':
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 'f');

        in.close();
    }
}
