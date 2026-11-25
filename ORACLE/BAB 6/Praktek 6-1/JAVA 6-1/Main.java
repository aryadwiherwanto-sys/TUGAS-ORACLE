import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Deck d = new Deck();

        // (a) Verifikasi shuffle: deck sebelum dan sesudah diacak
        System.out.println("=== DECK SEBELUM SHUFFLE ===");
        d.print();
        d.shuffle();
        System.out.println("\n=== DECK SETELAH SHUFFLE ===");
        d.print();

        // (b) Hand pemain, 2 kartu awal
        Hand player = new Hand();
        player.add(d.deal());
        player.add(d.deal());

        // (d) Hand dealer
        Hand dealer = new Hand();
        dealer.add(d.deal());
        dealer.add(d.deal());

        System.out.println("\n=== BLACKJACK ===");
        System.out.println("Kartu dealer: " + dealer.cards[0] + " dan satu kartu tertutup");

        // Giliran pemain
        boolean lanjut = true;
        while (lanjut && !player.isFull() && player.getPoints() <= 21) {
            System.out.println("\nKartu Anda:");
            player.print();
            System.out.println("Poin Anda: " + player.getPoints());

            System.out.print("Mau kartu lagi? (y/n): ");
            char jawab = Character.toLowerCase(in.next().charAt(0));
            if (jawab == 'y') {
                player.add(d.deal());
            } else {
                lanjut = false;
            }
        }

        System.out.println("\nKartu akhir Anda:");
        player.print();
        int poinPlayer = player.getPoints();
        System.out.println("Poin Anda: " + poinPlayer);

        if (poinPlayer > 21) {
            System.out.println("Poin melebihi 21. Anda kalah!");
            in.close();
            return;
        }

        // Giliran dealer: berhenti jika poin >= 16
        while (dealer.getPoints() < 16 && !dealer.isFull()) {
            dealer.add(d.deal());
        }

        System.out.println("\nKartu dealer:");
        dealer.print();
        int poinDealer = dealer.getPoints();
        System.out.println("Poin dealer: " + poinDealer);

        if (poinDealer > 21 || poinPlayer > poinDealer) {
            System.out.println("Anda menang!");
        } else if (poinPlayer == poinDealer) {
            System.out.println("Seri!");
        } else {
            System.out.println("Dealer menang!");
        }

        in.close();
    }
}
