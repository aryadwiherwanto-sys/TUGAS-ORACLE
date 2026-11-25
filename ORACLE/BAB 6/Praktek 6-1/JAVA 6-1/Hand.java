public class Hand {
    Card[] cards = new Card[5];
    int count = 0;

    boolean isFull() {
        return count == cards.length;
    }

    void add(Card c) {
        if (!isFull()) {
            cards[count] = c;
            count++;
        }
    }

    // Jika total > 21, ubah Ace dari 11 menjadi 1 (kurangi 10) satu per satu
    int getPoints() {
        int total = 0;
        int aceSebagai11 = 0;
        for (int i = 0; i < count; i++) {
            total += cards[i].points;
            if (cards[i].isAce()) aceSebagai11++;
        }
        while (total > 21 && aceSebagai11 > 0) {
            total -= 10;
            aceSebagai11--;
        }
        return total;
    }

    void print() {
        for (int i = 0; i < count; i++)
            System.out.println("  " + cards[i]);
    }
}
