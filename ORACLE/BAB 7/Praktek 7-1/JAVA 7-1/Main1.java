import java.util.Scanner;

public class Main1 {
    static Card kartuAcak() {
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        return new Card(suitNumber, faceNumber);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Card[] hand = new Card[5];
        int jumlahKartu = 0;
        int totalPoin = 0;

        // Dua kartu acak awal
        for (int i = 0; i < 2; i++) {
            hand[jumlahKartu] = kartuAcak();
            totalPoin += hand[jumlahKartu].points;
            jumlahKartu++;
        }

        // (a) Tampilkan dua kartu dan total poinnya
        System.out.println(hand[0]);
        System.out.println(hand[1]);
        System.out.println("Total poin: " + totalPoin);

        // (b) dan (c) Loop: berhenti jika poin > 21, pengguna menolak, atau kartu = 5
        while (jumlahKartu < 5 && totalPoin <= 21) {
            System.out.print("Mau kartu lagi? (y/n): ");
            char jawab = Character.toLowerCase(in.next().charAt(0));

            if (jawab != 'y') {
                break;
            }

            hand[jumlahKartu] = kartuAcak();
            totalPoin += hand[jumlahKartu].points;
            jumlahKartu++;

            System.out.println("\nKartu baru: " + hand[jumlahKartu - 1]);
            System.out.println("Hand Anda:");
            for (int i = 0; i < jumlahKartu; i++) {
                System.out.println("  " + hand[i] + " (" + hand[i].points + " poin)");
            }
            System.out.println("Total poin: " + totalPoin);
        }

        if (totalPoin > 21) {
            System.out.println("Poin melebihi 21!");
        } else if (jumlahKartu == 5) {
            System.out.println("Hand sudah mencapai 5 kartu.");
        }

        in.close();
    }
}
