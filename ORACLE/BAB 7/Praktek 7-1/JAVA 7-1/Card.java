public class Card {
    String suit, name;
    int points;

    Card(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }

    String getSuit(int n) {
        switch (n) {
            case 1: return "Hearts";
            case 2: return "Diamonds";
            case 3: return "Clubs";
            default: return "Spades";
        }
    }

    String getName(int n) {
        switch (n) {
            case 1: return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return String.valueOf(n);
        }
    }

    int getPoints(String name) {
        switch (name) {
            case "Ace": return 11;
            case "Jack":
            case "Queen":
            case "King": return 10;
            default: return Integer.parseInt(name);
        }
    }
}
