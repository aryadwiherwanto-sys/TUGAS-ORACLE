public class Main {
    public static void main(String args[]) {
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        Card newCard = new Card(suitNumber, faceNumber);
        System.out.println(newCard);

        // Card acak kedua
        int suitNumber2 = (int) (Math.random() * 4.0 + 1);
        int faceNumber2 = (int) (Math.random() * 13.0 + 1);
        Card secondCard = new Card(suitNumber2, faceNumber2);
        System.out.println(secondCard);
    }
}
