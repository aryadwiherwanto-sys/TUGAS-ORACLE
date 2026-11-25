import java.util.Scanner;

public class PesanRahasia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pesan = "";
        int jumlah = 0;

        while (jumlah < 10) {
            System.out.print("Masukkan angka ke-" + (jumlah + 1) + ": ");
            int kode = in.nextInt();

            String huruf;
            switch (kode) {
                case 1: huruf = "D"; break;
                case 2: huruf = "W"; break;
                case 3: huruf = "E"; break;
                case 4: huruf = "L"; break;
                case 5: huruf = "H"; break;
                case 6: huruf = "O"; break;
                case 7: huruf = "R"; break;
                default:
                    System.out.println("Angka belum terpecahkan, masukkan angka baru.");
                    continue;
            }

            pesan += huruf;
            jumlah++;
        }

        System.out.println("Pesan: " + pesan);
        in.close();
    }
}